package br.com.selmes.seriesws.models

import javax.persistence.*

@Entity
data class Serie (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String,
    @ManyToOne
    var user: User,
    var score: Int? = 0,
    var description: String? = null,
    @OneToMany(mappedBy = "serie")
    var season:List<Season> = ArrayList(),
    @Enumerated(value = EnumType.STRING)
    var status: StatusSerie = StatusSerie.WATCHING
)