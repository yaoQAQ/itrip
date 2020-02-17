package com.example.booksystem.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/book")
    @ResponseBody
    public Book book(){
        Book book=new Book();
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
    @GetMapping("/books")
    public ModelAndView books(){
        List<Book> books=new ArrayList<>();
        Book b1=new Book();
        b1.setName("三国演义");
        b1.setAuthor("罗贯中");
        Book b2=new Book();
        b2.setName("红楼梦");
        b2.setAuthor("曹雪芹");
        books.add(b1);
        books.add(b2);
        ModelAndView mv=new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("books");
        return mv;
    }
}
