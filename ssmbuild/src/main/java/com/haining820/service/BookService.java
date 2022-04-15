package com.haining820.service;

import com.haining820.pojo.Book;

import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Book book);
    //删除一本书
    int deleteBookById(int id);
    //修改一本书
    int updateBook(Book book);
    //查询一本书
    Book queryBookById(int id);
    //查询全部
    List<Book> queryAllBook();
    //通过名字查询
    List<Book> queryBookByName(String name);
}
