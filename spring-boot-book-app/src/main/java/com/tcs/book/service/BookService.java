package com.tcs.book.service;

import java.util.List;

import com.tcs.book.entity.Book;
import com.tcs.book.exceptions.BookNotFoundException;

public interface BookService {
	int addBook(Book book);
	int updateBook(Book book);
	void removeBook(int bookId);
	List<Book> getAllBooks();
	Book getBookById(int bookId) throws BookNotFoundException;
	List<Book> searchBook(String searchKey);
	List<Book> findByTitle(String title);
}
