package com.example.scala

import com.example.scala.config.BootConfig
import org.springframework.boot.SpringApplication

object ScalaApplication extends App {
	SpringApplication.run(classOf[BootConfig])
}
