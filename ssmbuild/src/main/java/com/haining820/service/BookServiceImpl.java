package com.haining820.service;

import com.haining820.dao.BookMapper;
import com.haining820.pojo.Book;

import java.util.List;

public class BookServiceImpl implements BookService{

    //service层调dao层:组合dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Book books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public List<Book> queryBookByName(String name) {
        return bookMapper.queryBookByName(name);
    }
}
