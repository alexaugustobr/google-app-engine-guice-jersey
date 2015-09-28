package com.roldan.google.infrastructure.jersey;

import javax.inject.Inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import com.roldan.google.infrastructure.guice.MyApplicationServletContextListener;

public class MyApplicationResourceConfig extends ResourceConfig {

    @Inject
    public MyApplicationResourceConfig(ServiceLocator serviceLocator) {
        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(MyApplicationServletContextListener.injector);
    }
}