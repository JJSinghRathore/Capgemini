package com.cg.OneToMany;

import jakarta.persistence.*;

//@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String answer;

    @ManyToOne
    @JoinColumn(name="question_id") //it is used as foreign key
    private Question question;
    public Answer(){}

    public Answer(String answer, Question question) {
        this.answer = answer;
        this.question=question;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
