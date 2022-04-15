package com.haining820.controller;

import com.haining820.pojo.Book;
import com.haining820.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    //controller调service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    //查询全部书籍并且返回到一个书籍页面
    @RequestMapping("/book/allBook")
    public String list(Model model) {
        List<Book> bookList = bookService.queryAllBook();
        model.addAttribute("list", bookList);
        return "allBook";
    }

    //跳转至添加书籍
    @RequestMapping("/book/toAddPage")
    public String toAddPage(Model model) {
        return "addPage";
    }

    //处理添加书籍的请求
    @RequestMapping("/book/addBook")
    public String addBook(Book book) {
        // System.out.println("新增书籍"+book);
        bookService.addBook(book);
        return "redirect:/book/allBook";  //重定向
    }

    //跳转到修改页面
    @RequestMapping("/book/toUpdate/{bookId}")
    public String toUpdate(@PathVariable("bookId") int id, Model model) {
        Book book = bookService.queryBookById(id);
        System.out.println("toUpdate:" + book);
        model.addAttribute("singleBook", book);
        return "updatePage";
    }

    @RequestMapping("/book/updateBook")
    public String updateBook(Book book) {
        System.out.println("updateBook:" + book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/book/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }


    //搜索书籍
    @RequestMapping("/book/queryBookByName")
    public String queryBook(String bookName, Model model) {
        List<Book> books = bookService.queryBookByName(bookName);
        System.err.println("queryBookByName:" + books);
        if (books.isEmpty()) {
            books = bookService.queryAllBook();
            System.err.println("null->queryAllBook");
            model.addAttribute("error", "未查到！");
        }
        model.addAttribute("list", books);
        return "allBook";
    }
}
