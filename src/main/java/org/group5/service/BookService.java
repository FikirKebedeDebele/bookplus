package org.group5.service;

import org.group5.model.Book;
import org.group5.model.Category;
import org.group5.model.Product;

import java.util.Set;

/**
 * Created by Bijay on 7/10/2016.
 */


public interface BookService {

    void add(Book book);
    void update(Book book);
    void delete(long id);
    Book findById(long id);
    Set<Book> getAll();

    int getProductCopies(Product p);

    Set<Book> getLastestBook(int limit);

    Set<Book> getSpecialDiscountedBook(int limit);

    Set<Book> getBookByCategory(Category category);


}
