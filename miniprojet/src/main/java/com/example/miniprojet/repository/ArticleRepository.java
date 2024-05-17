package com.example.miniprojet.repository;

import com.example.miniprojet.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}

