package com.springrestapi.restapi.dao;

import com.springrestapi.restapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository <Book,Long>{
}
