package com.Read2Learn.igrapel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> allBooks()
    {
        System.out.println("Here");
        return bookRepository.findAll();
    }

    public Optional<Book> findBookByIsbn(String isbn)
    {
        return bookRepository.findBookByIsbn(isbn);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

}
