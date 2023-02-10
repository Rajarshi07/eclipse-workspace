package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int QuestionId;
	@Override
	public String toString() {
		return "Question [QuestionId=" + QuestionId + ", Question=" + Question + ", ans=" + ans + "]";
	}


	String Question;
	@OneToOne
	Answer ans;


	public Question(int questionId, String question) {
		super();
		QuestionId = questionId;
		Question = question;
	}


	public Question(String question) {
		super();
		Question = question;
	}

	public int getQuestionId() {
		return QuestionId;
	}


	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}


	public String getQuestion() {
		return Question;
	}


	public void setQuestion(String question) {
		Question = question;
	}


	public Answer getAns() {
		return ans;
	}


	public void setAns(Answer ans) {
		this.ans = ans;
	}


	public Question() {
		// TODO Auto-generated constructor stub
	}

}
