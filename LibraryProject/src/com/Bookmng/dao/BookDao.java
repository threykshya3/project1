package com.Bookmng.dao;

import java.util.List;

import com.Bookmng.model.Book;

public interface BookDao {
	public List<Book> getAllBooks();
	   public Book getBook(int bookId);
	   public void updateBook(Book book);
	   public void deleteBook(int bookId);

}
