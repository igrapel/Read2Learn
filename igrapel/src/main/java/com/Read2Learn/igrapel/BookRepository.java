package com.Read2Learn.igrapel;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<Book, ObjectId>
{
    Optional<Book> findBookByIsbn(String isbn);

}
