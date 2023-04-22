package com.bookStore.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
