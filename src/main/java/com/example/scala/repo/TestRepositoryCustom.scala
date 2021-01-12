package com.example.scala.repo

import com.example.scala.model.Test

import java.util.List

trait TestRepositoryCustom {
  def custom(): List[Test]
}
