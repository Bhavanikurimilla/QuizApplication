package com.project.quizapp.dao;

import com.project.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{
    List<Question> findByCategory(String category);
  //   @Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
  @Query(nativeQuery = true,value = "SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ")

  List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
