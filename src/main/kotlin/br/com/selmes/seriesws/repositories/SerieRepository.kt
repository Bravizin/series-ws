package br.com.selmes.seriesws.repositories

import br.com.selmes.seriesws.models.Serie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SerieRepository: JpaRepository<Serie, Long> {
}