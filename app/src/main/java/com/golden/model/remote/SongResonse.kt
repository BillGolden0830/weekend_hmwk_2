package com.golden.model.remote

data class SongResonse (
    val items: List<SongItem>
)

data class SongItem(
    val song: SongInfo
)

data class SongInfo(
    val artistName: String,
    val collectionName: String,
    val previewURL: SongPreview,
    val artworkUrl60: SongImage,
    val trackPrice: Float,

    )

data class SongImage(
    val thumb: String
    )

data class SongPreview(
    val prevUrl: String
)