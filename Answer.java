package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer 
{
	@Id
	private int ansId;
	private String ans;
	
	@ManyToOne
	private Question quetion;

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQuetion() {
		return quetion;
	}

	public void setQuetion(Question quetion) {
		this.quetion = quetion;
	}

	public Answer(int ansId, String ans, Question quetion) {
		super();
		this.ansId = ansId;
		this.ans = ans;
		this.quetion = quetion;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", ans=" + ans + "]";
	}
	

}
