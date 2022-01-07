package br.com.selmes.seriesws.services

import br.com.selmes.seriesws.models.Serie
import br.com.selmes.seriesws.models.User
import org.springframework.stereotype.Service

@Service
class SerieService() {

    fun teste(idSerie: Long): Serie {
        return Serie(
            id = idSerie,
            name = "teste",
            score = 4,
            description = "testando",
            user = User(
                name = "leo",
                email = "l@l.co",
                password = "tel190"
            )
        )
    }

}