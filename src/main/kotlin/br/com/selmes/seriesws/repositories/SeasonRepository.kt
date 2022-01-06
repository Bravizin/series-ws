package br.com.selmes.seriesws.repositories

import br.com.selmes.seriesws.models.Season
import org.springframework.data.jpa.repository.JpaRepository

interface SeasonRepository: JpaRepository<Season, Long> {
}