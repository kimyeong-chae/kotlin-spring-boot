package com.yckim.api

import com.yckim.domain.Article
import com.yckim.repository.ArticleRepository
import org.springframework.web.bind.annotation.*

@RequestMapping("/api")
class ArticleController(val articleRepository: ArticleRepository) {

    @PostMapping("/article")
    fun create(@RequestBody article: Article) : Article {
        return articleRepository.save(article)
    }

    @DeleteMapping("/article/{seq}")
    fun delete(@PathVariable seq: Int) {
        return articleRepository.delete(Article(seq))
    }
}