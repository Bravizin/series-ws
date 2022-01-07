package br.com.selmes.seriesws.repositories

import br.com.selmes.seriesws.models.Season
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SeasonRepository: JpaRepository<Season, Long> {
}