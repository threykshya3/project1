package com.Bookmng.dao;

import java.util.ArrayList;
import java.util.List;

import com.Bookmng.model.Book;

public class BookDaoImpl implements BookDao{
	List<Book> books;
	 public BookDaoImpl(){
		books = new ArrayList<Book>();
		Book book1 = new Book("Oracle 10g guide",0,200);
		Book book2 = new Book("java programming",1,300);
		books.add(book1);
		books.add(book2);		
		}
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}
	@Override
	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		return books.get(bookId);
	}
	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("book in Dao"+book);
	      books.get(book.getBookId()).setBookname(book.getBookname());
	
	      System.out.println("Book: BookId " + book.getBookId() + ", updated with name"+ book.getBookname()+ "in the database");
	   }
		
	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		books.remove(bookId);
	}
	
	
	   
		
	}
	

	

