package br.com.selmes.seriesws.mappers

interface Mapper<T, U> {
    fun map(t:T) : U
}