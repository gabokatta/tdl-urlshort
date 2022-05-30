package com.tdl.urlshort.service

import com.tdl.urlshort.database.repository.URLRepository
import com.tdl.urlshort.util.HashGenerator
import jakarta.inject.Singleton

@Singleton
class URLShorteningService(private val repository: URLRepository,
                           private val hashGenerator: HashGenerator) : ShorteningService
{
    override fun shortenURL() : Long = TODO("Not yet implemented")

    override fun redirectURL() : Long = TODO("Not yet implemented")

    override fun getUsageMetrics() : Long = TODO("Not yet implemented")
}