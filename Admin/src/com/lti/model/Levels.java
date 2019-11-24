package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Levels")
public class Levels 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level_seq")
	@SequenceGenerator(sequenceName = "level_seq", name = "level_seq", allocationSize = 1)
	int level_id;

	@OneToOne
	@JoinColumn(name="TECHNOLOGY_ID")
	Technologies t;

		@Column(name="level_name")
		String levelName;

	
	public String getLevelName() {
			return levelName;
		}


		public void setLevelName(String levelName) {
			this.levelName = levelName;
		}


	public Levels(int level_id, Technologies t, String levelName) {
			super();
			this.level_id = level_id;
			this.t = t;
			this.levelName = levelName;
		}


	public Levels(int level_id, Technologies t) {
		super();
		this.level_id = level_id;
		this.t = t;
	}


	public Levels() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getLevel_id() {
		return level_id;
	}


	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}


	public Technologies getT() {
		return t;
	}


	public void setT(Technologies t) {
		this.t = t;
	}


	@Override
	public String toString() {
		return "Levels [level_id=" + level_id + ", t=" + t + ", levelName=" + levelName + "]";
	}
	
	
	

}
