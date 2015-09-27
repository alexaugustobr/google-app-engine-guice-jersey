package com.roldan.google.interfaces.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class ApplicationServletContextListener extends GuiceServletContextListener {
	
	public static Injector injector;
	
	@Override
	protected Injector getInjector() {
		injector = Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
				install(new MainModule());
			}
		});
		return injector;
	}
}
