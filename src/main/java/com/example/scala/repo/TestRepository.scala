package com.example.scala.repo

import com.example.scala.model.Test
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository trait TestRepository
  extends CrudRepository[Test, String]
  with TestRepositoryCustom
