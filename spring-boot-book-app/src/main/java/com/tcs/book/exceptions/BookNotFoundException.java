package com.tcs.book.exceptions;

public class BookNotFoundException extends RuntimeException{
	public BookNotFoundException() {
		super("Book not available...");
	}
}
