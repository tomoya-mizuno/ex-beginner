package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Exam04Form {
	@NotBlank(message = "名前は入力必須です")
	private String name;
	@NotBlank(message = "年齢は入力必須です")
	@Pattern(regexp = "[0-9]{0,3}", message = "年齢の入力値が不正です")
	private String age;
	@NotBlank(message = "コメントは入力必須です")
	private String comment;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "Exam04Form [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
}
