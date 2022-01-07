package br.com.selmes.seriesws.dto

import br.com.selmes.seriesws.models.StatusSerie

data class SeasonForm (
    val seasonNumber: Int,
    val score: Int? = 0,
    val description: String? = null,
    val idSerie: Long,
    val status: StatusSerie = StatusSerie.WATCHING,
)
