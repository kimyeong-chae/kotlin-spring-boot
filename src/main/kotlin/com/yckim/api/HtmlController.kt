package com.yckim.api

import com.yckim.repository.ArticleRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class HtmlController(val articleRepository: ArticleRepository) {

    @GetMapping("/")
    fun home(model: Model): String {
        model["message"] = "Hello World"
        model["articles"] = articleRepository.findAll()
        return "blog"
    }

    @GetMapping("/article/{seq}")
    fun article(model: Model, @PathVariable seq : Int) : String {
        model["article"] = articleRepository.findById(seq).orElseThrow { IllegalArgumentException("Wrong article id provided") }
        return "article"
    }
}