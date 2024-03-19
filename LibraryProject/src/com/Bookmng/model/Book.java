package com.Bookmng.model;

public class Book {
	private String Bookname;
	private int bookId;
	private int price;
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String bookname, int bookId,int price) {
		super();
		Bookname = bookname;
		this.bookId = bookId;
		this.price=price;
	}
}

