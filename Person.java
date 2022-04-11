package com.entity;
//one to one.
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Person
{
	@Id
	private int pid;
	 
	@Column(nullable=false)
	private String pname;
	
	@OneToOne
	Mapping mapping;
	 
	public int getPid()
	{
		return pid;
	}
public void setpid(int pid)
{
	this.pid = pid;
}
public String getPname()
{
	return pname;
}
public void setpname(String pname)
{
this.pname = pname;
}
public Mapping getMapping() 
{
	return mapping;
}
public void setMapping(Mapping mapping)
{
	this.mapping = mapping;
	}
public Person(int pid,String pname,Mapping mapping)
{
super();
this.pid=pid ;
this.pname=pname ;
this.mapping=mapping ;
}

public Person() 
{
super();
}

@Override
public String toString() {
return "Person [pid=" + pid+ ", pname=" +pname+ ", mapping=" + mapping + "]";
}
	
}










