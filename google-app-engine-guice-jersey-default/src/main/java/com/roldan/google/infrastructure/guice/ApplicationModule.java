package com.roldan.google.infrastructure.guice;

import com.google.inject.AbstractModule;
import com.roldan.google.application.Service;

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Service.class);
	}
}