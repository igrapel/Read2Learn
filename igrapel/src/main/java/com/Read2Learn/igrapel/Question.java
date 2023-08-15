package com.Read2Learn.igrapel;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
@Data
public class Question {
    @Id
    private ObjectId id;
    private String isbn;

    private String questionText;
    private String answer;

    public Question(String questionText, String answer, String isbn) {
        this.isbn = isbn;
        this.questionText = questionText;
        this.answer = answer;
    }



    public boolean checkAnswer(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer);
    }
}
