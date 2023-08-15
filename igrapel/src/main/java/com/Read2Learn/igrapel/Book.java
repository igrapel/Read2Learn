package com.Read2Learn.igrapel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book
{

    @Id
    private ObjectId id;
    private String isbn;
    private String title;
    private String author;
    @DocumentReference
    private List<Question> questionIds;





}
