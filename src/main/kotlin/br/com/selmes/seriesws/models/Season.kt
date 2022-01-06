package br.com.selmes.seriesws.models

import javax.persistence.*

@Entity
data class Season (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var seasonNumber: Int,
    var score: Int? = 0,
    var description: String? = null,
    @ManyToOne
    var serie: Serie,
    @Enumerated(value = EnumType.STRING)
    var status: StatusSerie = StatusSerie.WATCHING
)