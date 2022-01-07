package br.com.selmes.seriesws.dto

import br.com.selmes.seriesws.models.StatusSerie

data class SeasonView (
    val id: Long?,
    val seasonNumber: Int,
    val score: Int? = 0,
    val description: String? = null,
    val status: StatusSerie
)