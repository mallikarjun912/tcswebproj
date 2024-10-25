package com.tcs.book.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tcs.book.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	List<Book> findByTitle(String title);
	List<Book> findByTitleLike(String title);
	@Query(value = "select bk from Book bk where bk.title like %?1%")
	List<Book> searchForBooks(String str);
	
}
