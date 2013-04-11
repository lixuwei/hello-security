package com.lee.study.domain;

import java.io.Serializable;

/**
 * @description Message Object
 * @author AlexLee
 * @createTime 2013-4-11 下午4:16:20
 * 
 * @TypeName com.lee.study.domain.Message
 */
public class Message implements Serializable{

	private static final long serialVersionUID = 1L;
	//id
	private Long id;
	//作者
	private String author;
	//标题
	private String title;
	//内容
	private String body;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	
}
