package br.com.selmes.seriesws.services

import br.com.selmes.seriesws.dto.SeasonForm
import br.com.selmes.seriesws.dto.SeasonView
import br.com.selmes.seriesws.mappers.SeasonFormMapper
import br.com.selmes.seriesws.mappers.SeasonViewMapper
import br.com.selmes.seriesws.repositories.SeasonRepository
import org.springframework.stereotype.Service

@Service
class SeasonService(private val seasonRepository: SeasonRepository,
                    private val seasonFormMapper: SeasonFormMapper, private val seasonViewMapper: SeasonViewMapper
) {

    fun create(newSeason: SeasonForm): SeasonView{
        val season = seasonFormMapper.map(newSeason)
        seasonRepository.save(season)
        return seasonViewMapper.map(season)
    }

    fun get(): List<SeasonView> {
        val seasons = seasonRepository.findAll()
        return seasons.map { season -> seasonViewMapper.map(season) }
    }

}