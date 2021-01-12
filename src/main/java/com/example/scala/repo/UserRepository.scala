package com.example.scala.repo

import com.example.scala.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository trait UserRepository extends CrudRepository[User, String] {}
