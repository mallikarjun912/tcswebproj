package com.tcs.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.book.entity.Book;
import com.tcs.book.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired 
	BookService service;
	
	@PostMapping
	public ResponseEntity<String> addBook(@RequestBody Book book){
		int id = service.addBook(book);
		return new ResponseEntity<String>("inserted "+id,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> bookList = service.getAllBooks();
		return new ResponseEntity<List<Book>>(bookList,HttpStatus.OK);
	}
	@GetMapping("/search/{key}")
	public ResponseEntity<List<Book>> searchBooks(@PathVariable String key){
		List<Book> bookList = service.searchBook(key);
		return new ResponseEntity<List<Book>>(bookList,HttpStatus.OK);
	}
	
	@GetMapping("/bytitle/{title}")
	public ResponseEntity<List<Book>> getBooksByTitle(@PathVariable String title){
		List<Book> bookList = service.findByTitle(title);
		return new ResponseEntity<List<Book>>(bookList,HttpStatus.OK);
	}
	@GetMapping("{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable int bookId){
		Book book = service.getBookById(bookId);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		int id = service.updateBook(book); 
		return new ResponseEntity<String>("updated "+id,HttpStatus.OK);
	}
	
	@DeleteMapping("/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable int bookId){
		service.removeBook(bookId);
		return new ResponseEntity<String>("Book deleted..",HttpStatus.OK);  
	}

}
