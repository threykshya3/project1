package com.Bookmng.model;

public class BookAuthorDTO {
	 String Bookname;
	 String Authorname;
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	@Override
	public String toString() {
		return "BookAuthorDTO [BookName=" + Bookname + ", AuthorName=" + Authorname + "]";
	}
	public BookAuthorDTO(String bookname, String authorname) {
		super();
		Bookname = bookname;
		Authorname = authorname;
	}

}
