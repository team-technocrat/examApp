package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Technologies")
public class Technologies 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "technologies_seq")
	@SequenceGenerator(sequenceName = "technologies_seq", name = "technologies_seq", allocationSize = 1)
	
	int technology_id;
	String technology_name;
	
	
	public int getTechnology_id() {
		return technology_id;
	}
	public void setTechnology_id(int technology_id) {
		this.technology_id = technology_id;
	}
	public String getTechnology_name() {
		return technology_name;
	}
	public void setTechnology_name(String technology_name) {
		this.technology_name = technology_name;
	}
	public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technologies(int technology_id, String technology_name) {
		super();
		this.technology_id = technology_id;
		this.technology_name = technology_name;
	}
	@Override
	public String toString() {
		return "Technologies [technology_id=" + technology_id + ", technology_name=" + technology_name + "]";
	}
	
	
	
}
