package com.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionO2M {
	@Id
	@Column(name="question_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int QuestionId;
	@Override
	public String toString() {
		return "QuestionO2M [QuestionId=" + QuestionId + ", Question=" + Question + ", ans=" + ans + "]";
	}


	String Question;
	@OneToMany
	List<Answer> ans;


	public QuestionO2M(int questionId, String question) {
		super();
		QuestionId = questionId;
		Question = question;
	}


	public QuestionO2M(String question) {
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


	public List<Answer> getAns() {
		return ans;
	}


	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}


	public QuestionO2M() {
		// TODO Auto-generated constructor stub
	}

}
