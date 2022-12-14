package com.silverbullet.moviesapp.data.mappers

import com.silverbullet.moviesapp.data.local.entity.MovieInfoEntity
import com.silverbullet.moviesapp.data.local.entity.TrendingMovieInfoEntity
import com.silverbullet.moviesapp.data.remote.dto.MovieInfoDto
import com.silverbullet.moviesapp.domain.model.MovieInfo

fun MovieInfoDto.toMovieInfoEntity(): MovieInfoEntity {
    return MovieInfoEntity(
        id = id,
        title = title,
        adult = adult,
        posterPath = posterPath,
        backdropPath = backdropPath,
        genreIds = genreIds,
        voteAverage = voteAverage
    )
}

fun MovieInfoDto.toTrendingMovieEntity(): TrendingMovieInfoEntity {
    return TrendingMovieInfoEntity(
        id = id,
        title = title,
        adult = adult,
        posterPath = posterPath,
        backdropPath = backdropPath,
        genreIds = genreIds,
        voteAverage = voteAverage
    )
}

fun MovieInfoEntity.toMovieInfo(): MovieInfo {
    return MovieInfo(
        id = id,
        title = title,
        adult = adult,
        posterPath = posterPath,
        backdropPath = backdropPath,
        genreIds = genreIds,
        voteAverage = voteAverage
    )
}

fun TrendingMovieInfoEntity.toMovieInfo(): MovieInfo {
    return MovieInfo(
        id = id,
        title = title,
        adult = adult,
        posterPath = posterPath,
        backdropPath = backdropPath,
        genreIds = genreIds,
        voteAverage = voteAverage
    )
}