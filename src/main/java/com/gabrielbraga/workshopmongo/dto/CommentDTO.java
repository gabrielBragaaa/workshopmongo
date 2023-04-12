package com.gabrielbraga.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private Date date;
	private String text;
	private AuthorDTO author;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String id, Date date, String text, AuthorDTO author) {
		super();
		this.id = id;
		this.date = date;
		this.text = text;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
}
