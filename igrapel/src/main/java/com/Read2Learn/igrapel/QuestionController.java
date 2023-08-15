package com.Read2Learn.igrapel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/books")
public class QuestionController
{
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
        System.out.println("Here");
        return new ResponseEntity<Question>(questionService
                .createQuestion(question
                .getQuestionText(), question.getAnswer(), question.getIsbn()),
                HttpStatus.CREATED);
    }
}
