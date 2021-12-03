package com.example.p10
import com.google.gson.annotations.SerializedName

data class KitsuAnime(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("meta")
    val meta: Meta
) {
    data class Data(
        @SerializedName("attributes")
        val attributes: Attributes,
        @SerializedName("id")
        val id: String,
        @SerializedName("links")
        val links: Links,
        @SerializedName("relationships")
        val relationships: Relationships,
        @SerializedName("type")
        val type: String
    ) {
        data class Attributes(
            @SerializedName("abbreviatedTitles")
            val abbreviatedTitles: List<String>,
            @SerializedName("ageRating")
            val ageRating: String,
            @SerializedName("ageRatingGuide")
            val ageRatingGuide: String,
            @SerializedName("averageRating")
            val averageRating: String,
            @SerializedName("canonicalTitle")
            val canonicalTitle: String,
            @SerializedName("coverImage")
            val coverImage: CoverImage,
            @SerializedName("coverImageTopOffset")
            val coverImageTopOffset: Int,
            @SerializedName("createdAt")
            val createdAt: String,
            @SerializedName("description")
            val description: String,
            @SerializedName("endDate")
            val endDate: String,
            @SerializedName("episodeCount")
            val episodeCount: Int,
            @SerializedName("episodeLength")
            val episodeLength: Int,
            @SerializedName("favoritesCount")
            val favoritesCount: Int,
            @SerializedName("nextRelease")
            val nextRelease: Any,
            @SerializedName("nsfw")
            val nsfw: Boolean,
            @SerializedName("popularityRank")
            val popularityRank: Int,
            @SerializedName("posterImage")
            val posterImage: PosterImage,
            @SerializedName("ratingFrequencies")
            val ratingFrequencies: RatingFrequencies,
            @SerializedName("ratingRank")
            val ratingRank: Int,
            @SerializedName("showType")
            val showType: String,
            @SerializedName("slug")
            val slug: String,
            @SerializedName("startDate")
            val startDate: String,
            @SerializedName("status")
            val status: String,
            @SerializedName("subtype")
            val subtype: String,
            @SerializedName("synopsis")
            val synopsis: String,
            @SerializedName("tba")
            val tba: Any,
            @SerializedName("titles")
            val titles: Titles,
            @SerializedName("totalLength")
            val totalLength: Int,
            @SerializedName("updatedAt")
            val updatedAt: String,
            @SerializedName("userCount")
            val userCount: Int,
            @SerializedName("youtubeVideoId")
            val youtubeVideoId: String
        ) {
            data class CoverImage(
                @SerializedName("large")
                val large: String,
                @SerializedName("meta")
                val meta: Meta,
                @SerializedName("original")
                val original: String,
                @SerializedName("small")
                val small: String,
                @SerializedName("tiny")
                val tiny: String
            ) {
                data class Meta(
                    @SerializedName("dimensions")
                    val dimensions: Dimensions
                ) {
                    data class Dimensions(
                        @SerializedName("large")
                        val large: Large,
                        @SerializedName("small")
                        val small: Small,
                        @SerializedName("tiny")
                        val tiny: Tiny
                    ) {
                        data class Large(
                            @SerializedName("height")
                            val height: Int,
                            @SerializedName("width")
                            val width: Int
                        )

                        data class Small(
                            @SerializedName("height")
                            val height: Int,
                            @SerializedName("width")
                            val width: Int
                        )

                        data class Tiny(
                            @SerializedName("height")
                            val height: Int,
                            @SerializedName("width")
                            val width: Int
                        )
                    }
                }
            }

            data class PosterImage(
                @SerializedName("large")
                val large: String,
                @SerializedName("medium")
                val medium: String,
                @SerializedName("meta")
                val meta: Meta,
                @SerializedName("original")
                val original: String,
                @SerializedName("small")
                val small: String,
                @SerializedName("tiny")
                val tiny: String
            ) {
                data class Meta(
                    @SerializedName("dimensions")
                    val dimensions: Dimensions
                ) {
                    data class Dimensions(
                        @SerializedName("large")
                        val large: Large,
                        @SerializedName("medium")
                        val medium: Medium,
                        @SerializedName("small")
                        val small: Small,
                        @SerializedName("tiny")
                        val tiny: Tiny
                    ) {
                        data class Large(
                            @SerializedName("height")
                            val height: Int,
                            @SerializedName("width")
                            val width: Int
                        )

                        data class Medium(
                            @SerializedName("height")
                            val height: Int,
                            @SerializedName("width")
                            val width: Int
                        )

                        data class Small(
                            @SerializedName("height")
                            val height: Int,
                            @SerializedName("width")
                            val width: Int
                        )

                        data class Tiny(
                            @SerializedName("height")
                            val height: Int,
                            @SerializedName("width")
                            val width: Int
                        )
                    }
                }
            }

            data class RatingFrequencies(
                @SerializedName("10")
                val x10: String,
                @SerializedName("11")
                val x11: String,
                @SerializedName("12")
                val x12: String,
                @SerializedName("13")
                val x13: String,
                @SerializedName("14")
                val x14: String,
                @SerializedName("15")
                val x15: String,
                @SerializedName("16")
                val x16: String,
                @SerializedName("17")
                val x17: String,
                @SerializedName("18")
                val x18: String,
                @SerializedName("19")
                val x19: String,
                @SerializedName("2")
                val x2: String,
                @SerializedName("20")
                val x20: String,
                @SerializedName("3")
                val x3: String,
                @SerializedName("4")
                val x4: String,
                @SerializedName("5")
                val x5: String,
                @SerializedName("6")
                val x6: String,
                @SerializedName("7")
                val x7: String,
                @SerializedName("8")
                val x8: String,
                @SerializedName("9")
                val x9: String
            )

            data class Titles(
                @SerializedName("en")
                val en: String,
                @SerializedName("en_jp")
                val enJp: String,
                @SerializedName("en_us")
                val enUs: String,
                @SerializedName("ja_jp")
                val jaJp: String
            )
        }

        data class Links(
            @SerializedName("self")
            val self: String
        )

        data class Relationships(
            @SerializedName("animeCharacters")
            val animeCharacters: AnimeCharacters,
            @SerializedName("animeProductions")
            val animeProductions: AnimeProductions,
            @SerializedName("animeStaff")
            val animeStaff: AnimeStaff,
            @SerializedName("castings")
            val castings: Castings,
            @SerializedName("categories")
            val categories: Categories,
            @SerializedName("characters")
            val characters: Characters,
            @SerializedName("episodes")
            val episodes: Episodes,
            @SerializedName("genres")
            val genres: Genres,
            @SerializedName("installments")
            val installments: Installments,
            @SerializedName("mappings")
            val mappings: Mappings,
            @SerializedName("mediaRelationships")
            val mediaRelationships: MediaRelationships,
            @SerializedName("productions")
            val productions: Productions,
            @SerializedName("quotes")
            val quotes: Quotes,
            @SerializedName("reviews")
            val reviews: Reviews,
            @SerializedName("staff")
            val staff: Staff,
            @SerializedName("streamingLinks")
            val streamingLinks: StreamingLinks
        ) {
            data class AnimeCharacters(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class AnimeProductions(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class AnimeStaff(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Castings(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Categories(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Characters(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Episodes(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Genres(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Installments(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Mappings(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class MediaRelationships(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Productions(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Quotes(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Reviews(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class Staff(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }

            data class StreamingLinks(
                @SerializedName("links")
                val links: Links
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String,
                    @SerializedName("self")
                    val self: String
                )
            }
        }
    }

    data class Links(
        @SerializedName("first")
        val first: String,
        @SerializedName("last")
        val last: String,
        @SerializedName("next")
        val next: String
    )

    data class Meta(
        @SerializedName("count")
        val count: Int
    )
}