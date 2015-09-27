package com.roldan.google.interfaces.guice;

import com.google.inject.AbstractModule;

public class MainModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Service.class);
	}
}