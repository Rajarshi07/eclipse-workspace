package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int AnswerId;
	@Override
	public String toString() {
		return "Answer [AnswerId=" + AnswerId + ", Answer=" + Answer + "]";
	}


	String Answer;


	public Answer(String answer) {
		super();
		Answer = answer;
	}


	public Answer(String answer, int answerId) {
		super();
		Answer = answer;
		AnswerId = answerId;
	}


	public String getAnswer() {
		return Answer;
	}


	public void setAnswer(String answer) {
		Answer = answer;
	}


	public int getAnswerId() {
		return AnswerId;
	}


	public void setAnswerId(int answerId) {
		AnswerId = answerId;
	}


	public Answer() {
		// TODO Auto-generated constructor stub
	}

}
