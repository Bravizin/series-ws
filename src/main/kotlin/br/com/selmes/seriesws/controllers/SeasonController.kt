package br.com.selmes.seriesws.controllers

import br.com.selmes.seriesws.dto.SeasonForm
import br.com.selmes.seriesws.dto.SeasonView
import br.com.selmes.seriesws.services.SeasonService
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("/seasons")
class SeasonController(private val seasonService: SeasonService) {

    @PostMapping
    @Transactional
    fun createSeason(@RequestBody newSeason: SeasonForm, uriBuilder: UriComponentsBuilder): ResponseEntity<SeasonView> {
        val season = seasonService.create(newSeason)
        val uri = uriBuilder.path("/seasons/${season.id}").build().toUri()
        return ResponseEntity.created(uri).body(season)
    }

    @GetMapping
    fun getSeasons(): List<SeasonView> {
        return seasonService.get()
    }

}