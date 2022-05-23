package com.springrestapi.restapi.serviceImpl;

import com.springrestapi.restapi.dao.BookDao;
import com.springrestapi.restapi.entity.Book;
import com.springrestapi.restapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//indicates the business logic
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book getBook(long bookId) {
        return bookDao.getOne(bookId);
    }

    @Override
    public Book addBook(Book book) {
        bookDao.save(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        bookDao.save(book);
        return book;
    }

    @Override
    public Book deleteBook(long bookId) {
        Book entity = bookDao.getOne(bookId);
            bookDao.delete(entity);
        return entity;
    }

}

