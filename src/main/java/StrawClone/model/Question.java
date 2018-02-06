package StrawClone.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity(name="questions")
public class Question
{



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int question_Id;

    private String question;

    public Question(){}

    public Question(String Question) {
        super();
        this.question = Question;

    }


    public int getId() {
        return question_Id;
    }

    public void setId(int id) {
        this.question_Id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
