package com.Bookmng.service;

import java.util.List;

import com.Bookmng.dao.BookDao;
import com.Bookmng.dao.BookDaoImpl;
import com.Bookmng.model.Book;

public class BookServiceImpl implements BookService{
	BookDao dao;
	
	public BookServiceImpl() {
		dao=new BookDaoImpl();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		dao.updateBook(book);
	      System.out.println("Book: bookId " + book.getBookId() + ", updated in the database");
	   }

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		dao.deleteBook(bookId);
		
	}

	@Override
	public Book getBook(int bookId) {
		
		return dao.getBook(bookId);
	}

	

	

	

}
