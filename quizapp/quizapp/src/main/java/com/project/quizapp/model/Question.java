package com.project.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private String  difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String rightAnswer;


//    public String getOption4() {  return null;
//    }
//
//    public Integer getId()
//    {
//        return null;
//    }
//
//
//    public String getQuestionTitle() {  return null;
//    }
//
//    public String getOption1() {  return null;
//    }
//
//    public String getOption2() {  return null;
//    }
//
//    public String getOption3() {  return null;
//    }
}
