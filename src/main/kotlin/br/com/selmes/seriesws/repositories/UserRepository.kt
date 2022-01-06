package br.com.selmes.seriesws.repositories

import br.com.selmes.seriesws.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}