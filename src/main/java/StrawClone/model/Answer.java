package StrawClone.model;



import javax.persistence.*;

@Entity(name="answers")
public class Answer {


    @Id
    @GeneratedValue
    private int answer_Id;

    private String answer_body;

    private int num_times_picked;

    @ManyToOne
    @JoinColumn(name = "question_Id")
    private int question_Id;



    public Answer(){}


    public Answer(String ans_bdy, int q_id){
        this.answer_body = ans_bdy;
        this.question_Id = q_id;
        this.num_times_picked = 0;
    }

    public int getAnswer_Id() {
        return answer_Id;
    }


    public String getAnswerbody() {
        return answer_body;
    }

    public void setAnswerbody(String answerbody) {
        this.answer_body = answerbody;
    }

    public int getNum_times_picked() {
        return num_times_picked;
    }

    public void setNum_times_picked(int num_times_picked) {
        this.num_times_picked = num_times_picked;
    }

    public int getQuestion_Id() {
        return question_Id;
    }

    public void setQuestion_Id(int question_Id) {
        this.question_Id = question_Id;
    }
}
