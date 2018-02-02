package StrawClone.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity(name="t_polls")
public class Poll
{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public Integer getNum_answers() {
        return num_answers;
    }

    public void setNum_answers(Integer num_answers) {
        this.num_answers = num_answers;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String question;
    private String answers;
    private Integer num_answers;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    private boolean finished;

    public Poll(){}

    public Poll(String name, String description, Integer na, Date dateCreated, boolean finished) {
        super();
        this.num_answers = na;
        this.question = name;
        this.answers = description;
        this.dateCreated = dateCreated;
        this.finished = finished;
    }
}
