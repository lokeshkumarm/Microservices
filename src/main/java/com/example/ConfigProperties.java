package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("Demo")
public class ConfigProperties {
private String personName;
private int personId; 

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

}
