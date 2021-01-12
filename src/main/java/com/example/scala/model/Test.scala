package com.example.scala.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

import scala.annotation.meta.field
import scala.beans.BeanProperty

@Document class Test()
  (@(Id@field) @BeanProperty var id: String,
  @BeanProperty var x: String,
  @BeanProperty var y: Y){

}
