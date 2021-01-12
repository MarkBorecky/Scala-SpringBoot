package com.example.scala.repo
import com.example.scala.model.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

import java.util.List

@Repository @Transactional(readOnly = true)
class TestRepositoryCustomImpl()(
  @Autowired private val mongoTemplate: MongoTemplate
) extends TestRepositoryCustom{

  override def custom(): List[Test] = {
    val query:Query = new Query()
    mongoTemplate.find(query, classOf[Test])
  }
}
