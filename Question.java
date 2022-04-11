package com.entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question 
{
	@Id
	private int quesId;
	
	private String ques;
	
	@OneToMany(mappedBy ="question")
	
	private List<Answer> answer;

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public Question(int quesId, String ques, List<Answer> answer) {
		super();
		this.quesId = quesId;
		this.ques = ques;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", ques=" + ques + ", answer=" + answer + "]";
	}

	


		
	
	

}
