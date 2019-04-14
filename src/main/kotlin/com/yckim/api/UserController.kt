package com.yckim.api

import com.yckim.domain.User
import com.yckim.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api")
@RestController
class UserController(private val userRepository: UserRepository) {


    @PostMapping("/user")
    fun create(@RequestBody user : User) : User {
        return userRepository.save(user)
    }

    @DeleteMapping("/user/{id}")
    fun delete(@PathVariable id : String) {
        return userRepository.delete(User(id));
    }
}