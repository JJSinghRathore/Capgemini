package com.cg.OneToMany;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;
    private String quesName;
    private String level;
    @OneToMany(mappedBy="question", cascade = CascadeType.ALL)
    private List<Answer> answer;

    public Question(){}

    public Question(String quesName, String level) {
        this.quesName = quesName;
        this.level = level;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQuesName() {
        return quesName;
    }

    public void setQuesName(String quesName) {
        this.quesName = quesName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }


}
