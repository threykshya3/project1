package com.Bookmng.main;

import java.util.ArrayList;
import java.util.List;

import com.Bookmng.model.Author;
import com.Bookmng.model.Book;
import com.Bookmng.model.BookAuthorDTO;
import com.Bookmng.service.BookService;
import com.Bookmng.service.BookServiceImpl;


public class DaoBookPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 BookService bookService = new BookServiceImpl();
				 
	List<Book> list=bookService.getAllBooks();
	for (Book b : list) {
		System.out.println("Book: [bookId : " + b.getBookId() + ", Bookname : " + b.getBookname() + ", BookPrice : "+b.getPrice()+ " ]");
		}
	Book book =bookService.getAllBooks().get(0);
    System.out.println(book);
    book.setBookname("Life");
    bookService.updateBook(book);
    	
    int bookId=1;
    bookService.deleteBook(bookId);
    System.out.println("After delete");
    List<Book> bookList=bookService.getAllBooks();
    for (Book b : bookList) {
	       System.out.println("Book: [BookId : " + b.getBookId() + ", BookName : " + b.getBookname() + " ]");
	   }
    
    Author aut1=new Author("Sidney",0);
    Author aut2=new Author("Herbert Schildt",1);
    
    List<Author> autList=new ArrayList<Author>();
    autList.add(aut1);
    autList.add(aut2);
    
    
    List<BookAuthorDTO> bko=new ArrayList<BookAuthorDTO>();
    
    bko.add(new BookAuthorDTO(bookList.get(0).getBookname(),autList.get(0).getAuthorname()));
   // bko.add(new BookAuthorDTO(bookList.get(1).getBookname(),autList.get(1).getAuthorname()));
    
   for(BookAuthorDTO dtodata:bko) {
	   System.out.println(dtodata.getBookname() + " "+dtodata.getAuthorname());
   }
    
}



	}


