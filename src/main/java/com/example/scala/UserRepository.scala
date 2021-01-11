package com.example.scala

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository trait UserRepository extends CrudRepository[User, String] {}