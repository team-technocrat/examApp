package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Questions implements Comparable<Questions> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questions_seq")
	@SequenceGenerator(sequenceName = "questions_seq", name = "questions_seq", allocationSize = 1)
	int question_id;
	
	String question_desc;
	
	@OneToOne
	@JoinColumn(name="technology_id")
	Technologies technologies;
	
	@OneToOne
	@JoinColumn(name="level_id")
	Levels levels;

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_desc() {
		return question_desc;
	}

	public void setQuestion_desc(String question_desc) {
		this.question_desc = question_desc;
	}

	public Technologies getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Technologies technologies) {
		this.technologies = technologies;
	}

	public Levels getLevels() {
		return levels;
	}

	public void setLevels(Levels levels) {
		this.levels = levels;
	}

	public Questions(int question_id, String question_desc, Technologies technologies, Levels levels) {
		super();
		this.question_id = question_id;
		this.question_desc = question_desc;
		this.technologies = technologies;
		this.levels = levels;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Questions [question_id=" + question_id + ", question_desc=" + question_desc + ", technologies="
				+ technologies + ", levels=" + levels + "]";
	}


	@Override
	public int compareTo(Questions o) {
		int result=0;
		
		if(this.getQuestion_id()>o.getQuestion_id())
		{
			result=1;
		}
		else if(this.getQuestion_id()<o.getQuestion_id())
		{
			result=-1;
		}
		
		return result;
	}

	
	
}
