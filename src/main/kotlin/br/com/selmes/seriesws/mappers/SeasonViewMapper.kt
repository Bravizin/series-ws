package br.com.selmes.seriesws.mappers

import br.com.selmes.seriesws.dto.SeasonView
import br.com.selmes.seriesws.models.Season

class SeasonViewMapper: Mapper<Season, SeasonView> {
    override fun map(t: Season): SeasonView {
        return SeasonView(
            id = t.id,
            seasonNumber = t.seasonNumber,
            score = t.score,
            description = t.description,
            status = t.status
        )
    }

}
