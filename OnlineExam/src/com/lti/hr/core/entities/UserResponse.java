package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserResponse")
public class UserResponse {
	
	@Id
	@GeneratedValue
	@Column(name="USERRESPONSE_ID")
	private int userResponseId;
	
	@Column(name="EXAM_ID")
	private int examId;
	
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="SELECTED_ANSWER")
	private String selectedAnswer;

	public UserResponse() {
		super();
		
	}

	public UserResponse(int userResponseId, int examId, int questionId, String selectedAnswer) {
		super();
		this.userResponseId = userResponseId;
		this.examId = examId;
		this.questionId = questionId;
		this.selectedAnswer = selectedAnswer;
	}

	public int getUserResponseId() {
		return userResponseId;
	}

	public void setUserResponseId(int userResponseId) {
		this.userResponseId = userResponseId;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(String selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}

	@Override
	public String toString() {
		return "UserResponse [userResponseId=" + userResponseId + ", examId=" + examId + ", questionId=" + questionId
				+ ", selectedAnswer=" + selectedAnswer + "]";
	}
	
	
	
	
	
	
	
	
	

}
