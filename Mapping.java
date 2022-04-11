package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mapping 
{
@Id
private  int accountNo;

@Column(nullable=false)
private String accountType;

@OneToOne
Person person;
public int getAccountNo()
{
	return accountNo;
	}
public void setAccountNo(int accountNo) 
{
this.accountNo = accountNo;
}
public String getAccountType()
{
	return accountType;
	}
public void setAccountType(String accountType)
{
this.accountType= accountType;
}
public Person getPerson()
{
	return person;
	}
public void setPerson(Person person)
{
	this.person = person;
	
	}
public Mapping(int accountNo,String accountType,Person person)
{
	super();
	
	this.accountNo=accountNo ;
	this.accountType=accountType ;
	this.person=person ;
}

public Mapping() 
{
	super();
}

@Override
public String toString() {
	return "Mapping [accountNo=" + accountNo + ", accountType=" +accountType+ ", person=" + person + "]";
}
}





