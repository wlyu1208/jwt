package login.jwt.repository

import login.jwt.model.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<Users, Int> {
    fun findByEmail(email: String): Users?
}