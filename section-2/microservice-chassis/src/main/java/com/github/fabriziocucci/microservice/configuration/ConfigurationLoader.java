package com.github.fabriziocucci.microservice.configuration;

import com.github.fabriziocucci.microservice.MicroserviceConfiguration;
import com.yacl4j.core.ConfigurationBuilder;

public class ConfigurationLoader {

	public static <Configuration extends MicroserviceConfiguration> Configuration load(Class<Configuration> configurationClass) {
		return ConfigurationBuilder.newBuilder()
				.source().fileFromClasspath("chassis.yaml")
				.source().fileFromClasspath("service.yaml")
				.source().environmentVariables()
				.build(configurationClass);
	}
	
}
