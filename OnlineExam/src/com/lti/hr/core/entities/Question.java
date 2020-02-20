package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
public class Question {

	@Id
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="QUESTION")
	private int question;
	
	@Column(name="OPTION_1")
	private int option1;
	
	@Column(name="OPTION_2")
	private int option2;
	
	@Column(name="OPTION_3")
	private int option3;
	
	@Column(name="OPTION_4")
	private int option4;
	
	@Column(name="CORRECT_ANSWER")
	private int correctAnswer;
	
	@Column(name="SUBJECT_ID")
	private int subjectId;
	
	@Column(name="LEVELS")
	private int levels;

	public Question() {
		super();
	}

	public Question(int questionId, int question, int option1, int option2, int option3, int option4, int correctAnswer,
			int subjectId, int levels) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
		this.subjectId = subjectId;
		this.levels = levels;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

	public int getOption1() {
		return option1;
	}

	public void setOption1(int option1) {
		this.option1 = option1;
	}

	public int getOption2() {
		return option2;
	}

	public void setOption2(int option2) {
		this.option2 = option2;
	}

	public int getOption3() {
		return option3;
	}

	public void setOption3(int option3) {
		this.option3 = option3;
	}

	public int getOption4() {
		return option4;
	}

	public void setOption4(int option4) {
		this.option4 = option4;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", option1=" + option1 + ", option2="
				+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", correctAnswer=" + correctAnswer
				+ ", subjectId=" + subjectId + ", levels=" + levels + "]";
	}	
}
