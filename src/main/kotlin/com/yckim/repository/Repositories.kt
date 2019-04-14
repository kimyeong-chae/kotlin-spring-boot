package com.yckim.repository

import com.yckim.domain.Article
import com.yckim.domain.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Int>

interface UserRepository : CrudRepository<User, String>
