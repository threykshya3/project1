package com.Bookmng.model;

public class Author {
	private String Authorname;
	private int AuthorId;
	public Author(String authorname, int authorId) {
		super();
		Authorname = authorname;
		AuthorId = authorId;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	public int getAuthorId() {
		return AuthorId;
	}
	public void setAuthorId(int authorId) {
		AuthorId = authorId;
	}

}
