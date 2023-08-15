package com.Read2Learn.igrapel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Question createQuestion(String q, String a, String isbn)
    {
        Question question = questionRepository.insert(new Question(q, a, isbn));

        mongoTemplate.update(Book.class).matching(Criteria.where("isbn").is(isbn))
                .apply(new Update().push("questionIds").value(question)).first();

        return question;

    }
}
