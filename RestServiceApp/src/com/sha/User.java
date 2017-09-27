package com.sha;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable{
private  int id;
public int getId() {
	return id;
}

public User(int id, String name){
	this.id = id;
	this.name = name;
}
@XmlElement
public void setId(int id) {
	this.id = id;
}
private String name;


public String getName() {
	return name;
}

@XmlElement
public void setName(String name) {
	this.name = name;
}

}
