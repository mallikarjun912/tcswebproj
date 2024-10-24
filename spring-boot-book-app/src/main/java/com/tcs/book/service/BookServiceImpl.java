package com.tcs.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.book.entity.Book;
import com.tcs.book.exceptions.BookNotFoundException;
import com.tcs.book.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository repo;

	@Override
	public int addBook(Book book) {
		repo.save(book);
		return book.getBookId();
	}
	@Override
	public int updateBook(Book book) {
		repo.save(book);
		return book.getBookId();
	}
	@Override
	public void removeBook(int bookId) {
		repo.deleteById(bookId); 
	}
	@Override
	public List<Book> getAllBooks() {
		
		return repo.findAll();
	}
 
	@Override
	public Book getBookById(int bookId) {
		Optional<Book> optionalBook = repo.findById(bookId); 
		if(optionalBook.isEmpty())
			throw new BookNotFoundException();
		Book book = optionalBook.get();
		return book;
	}
	@Override
	public List<Book> searchBook(String searchKey) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> findByTitle(String title) {
		//return repo.findByTitle(title);
		return repo.findByTitleLike(title);
	}

}
