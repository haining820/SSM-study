package com.haining820.dao;

import com.haining820.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Book book);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //修改一本书
    int updateBook(Book book);
    //查询一本书
    Book queryBookById(@Param("bookId") int id);
    //查询全部
    List<Book> queryAllBook();
    //通过名字查询
    List<Book> queryBookByName(@Param("bookName") String name);
}
