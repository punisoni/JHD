package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetLoad
{
@Id
int roll;

@Column
String name;

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public GetLoad(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}

public GetLoad() {
	super();
	// TODO Auto-generated constructor stub
}

}
