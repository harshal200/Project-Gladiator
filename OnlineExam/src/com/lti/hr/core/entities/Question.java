package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
public class Question {

	@Id
	@Column(name="question_id")
	private int question_id;
	
	@Column(name="question")
	private int question;
	
	@Column(name="option_1")
	private int option_1;
	
	@Column(name="option_2")
	private int option_2;
	
	@Column(name="option_3")
	private int option_3;
	
	@Column(name="option_4")
	private int option_4;
	
	@Column(name="correct_answer")
	private int correct_answer;
	
	@Column(name="subject_id")
	private int subject_id;
	
	@Column(name="levels")
	private int levels;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(int question_id, int question, int option_1, int option_2, int option_3, int option_4,
			int correct_answer, int subject_id, int levels) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.option_1 = option_1;
		this.option_2 = option_2;
		this.option_3 = option_3;
		this.option_4 = option_4;
		this.correct_answer = correct_answer;
		this.subject_id = subject_id;
		this.levels = levels;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

	public int getOption_1() {
		return option_1;
	}

	public void setOption_1(int option_1) {
		this.option_1 = option_1;
	}

	public int getOption_2() {
		return option_2;
	}

	public void setOption_2(int option_2) {
		this.option_2 = option_2;
	}

	public int getOption_3() {
		return option_3;
	}

	public void setOption_3(int option_3) {
		this.option_3 = option_3;
	}

	public int getOption_4() {
		return option_4;
	}

	public void setOption_4(int option_4) {
		this.option_4 = option_4;
	}

	public int getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(int correct_answer) {
		this.correct_answer = correct_answer;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question=" + question + ", option_1=" + option_1
				+ ", option_2=" + option_2 + ", option_3=" + option_3 + ", option_4=" + option_4 + ", correct_answer="
				+ correct_answer + ", subject_id=" + subject_id + ", levels=" + levels + "]";
	}
	
	
	
}
