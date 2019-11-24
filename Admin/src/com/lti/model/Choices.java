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
public class Choices {
	
//	@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="question_id") 
	//Questions question;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "choice_seq")
	@SequenceGenerator(sequenceName = "choice_seq", name = "choice_seq", allocationSize = 1)
	int choice_id;
	
	 @OneToOne(fetch=FetchType.EAGER)
	 @JoinColumn(name="question_id") 
	 Questions question;
	 
	 	String choice_1;
		String choice_2;
		String choice_3;
		String choice_4;
		String correct_ans;
		
		public Choices() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Choices(int choice_id, Questions question, String choice_1, String choice_2, String choice_3,
				String choice_4, String correct_ans) {
			super();
			this.choice_id = choice_id;
			this.question = question;
			this.choice_1 = choice_1;
			this.choice_2 = choice_2;
			this.choice_3 = choice_3;
			this.choice_4 = choice_4;
			this.correct_ans = correct_ans;
		}
	
		public int getChoice_id() {
			return choice_id;
		}
		public void setChoice_id(int choice_id) {
			this.choice_id = choice_id;
		}
		public Questions getQuestion() {
			return question;
		}
		public void setQuestion(Questions question) {
			this.question = question;
		}
		public String getChoice_1() {
			return choice_1;
		}
		public void setChoice_1(String choice_1) {
			this.choice_1 = choice_1;
		}
		public String getChoice_2() {
			return choice_2;
		}
		public void setChoice_2(String choice_2) {
			this.choice_2 = choice_2;
		}
		public String getChoice_3() {
			return choice_3;
		}
		public void setChoice_3(String choice_3) {
			this.choice_3 = choice_3;
		}
		public String getChoice_4() {
			return choice_4;
		}
		public void setChoice_4(String choice_4) {
			this.choice_4 = choice_4;
		}
		public String getCorrect_ans() {
			return correct_ans;
		}
		public void setCorrect_ans(String correct_ans) {
			this.correct_ans = correct_ans;
		}
		
		@Override
		public String toString() {
			return "Choices [choice_id=" + choice_id + ", question=" + question + ", choice_1=" + choice_1
					+ ", choice_2=" + choice_2 + ", choice_3=" + choice_3 + ", choice_4=" + choice_4 + ", correct_ans="
					+ correct_ans + "]";
		}
		
		
		
		
		
	
}
