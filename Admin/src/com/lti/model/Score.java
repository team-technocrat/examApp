package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="UserScore")
public class Score
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "score_sequence")
	@SequenceGenerator(sequenceName = "score_sequence", name = "score_sequence", allocationSize = 1)
	int id;
	
	int user_id;
	int tot_score;
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(int id, int user_id, int tot_score) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.tot_score = tot_score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getTot_score() {
		return tot_score;
	}

	public void setTot_score(int tot_score) {
		this.tot_score = tot_score;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", user_id=" + user_id + ", tot_score=" + tot_score + "]";
	}

	
	
}
