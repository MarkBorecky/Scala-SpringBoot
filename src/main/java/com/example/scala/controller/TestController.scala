package com.example.scala.controller

import com.example.scala.model.Test
import com.example.scala.repo.TestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

import java.util

//@RestController
//@RequestMapping(Array("/test"))
class TestController @Autowired()(private val testRepository: TestRepository){
//  @GetMapping(Array("/custom"))
//  def myMethod(): String = "here you are!"
//  def custom(): util.List[Test] = testRepository.custom()
}
