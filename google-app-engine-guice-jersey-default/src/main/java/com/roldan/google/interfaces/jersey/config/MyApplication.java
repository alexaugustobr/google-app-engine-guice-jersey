package com.roldan.google.interfaces.jersey.config;

import javax.inject.Inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import com.roldan.google.interfaces.guice.ApplicationServletContextListener;

public class MyApplication extends ResourceConfig {

    @Inject
    public MyApplication(ServiceLocator serviceLocator) {
        packages("com.roldan.google.interfaces.jersey.resources");

        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);

        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(ApplicationServletContextListener.injector);
    }
}