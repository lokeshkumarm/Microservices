package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties
public class MicroServicesApplication { 

	@Value("${Demo.person-name}")
	void setName(String Name){
		System.out.println("setting the person name:"+ Name);
	}
	@Value("${Demo.person-id}")
	void setId(int Id){
		System.out.println("setting the person id:" + Id);
	}
	@Autowired
	void setEnv(Environment env){
		System.out.println("setting the env name:" + env.getProperty("Demo.person-name"));
	}
	@Autowired
	void setConfigProperties(ConfigProperties configProp){
		System.out.println("ConfigProperties.personName:" + configProp.getPersonName());
		System.out.println("ConfigProperties.personId:"+ configProp.getPersonId());
	}
	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApplication.class, args);
	}
}
