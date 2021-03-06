package org.group5.restcontroller;

import org.group5.model.Book;
import org.group5.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Bijay on 7/11/2016.
 */
@RestController
@RequestMapping("/api/book/")
public class BookRestController {

    @Autowired
    private BookService bookService;

    /**********GET All Book *************/
    @RequestMapping("all")
    public Set<Book> findAllBooks(){
        return bookService.getAll();
    }

    /**********GET ALL BOOKS By CategoryId *************/
    @RequestMapping("category/{id}")
    public Set<Book> findAllBooksInCateory(@PathVariable long id){
        if(id > 0)
            return bookService.getBookByCategory(id);
        else return new HashSet<Book>();
    }

    @RequestMapping("{id}")
    public Book findSingleBook(@PathVariable int id){
        return bookService.findById(id);
    }

    @RequestMapping("delete/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.delete(id);
    }

    @RequestMapping("copy/{id}")
    public int getProductCopy(@PathVariable int id){
        Book book = bookService.findById(id);
        return bookService.getProductCopies(book);
    }

    @RequestMapping("/special")
    public Set<Book> getSpecialsBook(){
        return bookService.get2SpecialDiscountedBook();
    }

    @RequestMapping("/latest")
    public Set<Book> getLatestBook(){
        return bookService.getLastest6Books();
    }


}
