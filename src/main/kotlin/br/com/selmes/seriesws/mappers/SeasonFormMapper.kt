package br.com.selmes.seriesws.mappers

import br.com.selmes.seriesws.dto.SeasonForm
import br.com.selmes.seriesws.models.Season
import br.com.selmes.seriesws.models.Serie
import br.com.selmes.seriesws.services.SerieService
import org.springframework.stereotype.Component

@Component
class SeasonFormMapper(private val serieService: SerieService): Mapper<SeasonForm, Season> {
    override fun map(t: SeasonForm): Season {
        return Season(
            seasonNumber = t.seasonNumber,
            score = t.score,
            description = t.description,
            serie = serieService.teste(t.idSerie),
            status = t.status
        )
    }
}