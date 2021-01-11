package com.example.scala

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, RestController}

import java.lang
import java.util.Optional

@RestController
@RequestMapping(Array("/api"))
class ApiUserController @Autowired()(private val userRepository: UserRepository){
  @GetMapping(Array("/users"))
  def getUsers(): lang.Iterable[User] = userRepository.findAll()

  @GetMapping(Array("/users/{id}"))
  def getUserById(@PathVariable id: String): Optional[User] = userRepository.findById(id)

}
