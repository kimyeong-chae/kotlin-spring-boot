package com.yckim.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
        @Id @Column(length = 20)
        val id : String="",
        val pw : String="",
        val name : String=""
)

@Entity
data class Article(
        @Id @GeneratedValue @Column(length = 8)
        val seq: Int = 0,
        val title: String = "",
        val content: String = "",
        val author: String = "",
        val id: String = ""
)

