package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Network Implementation of Repository that fetch mars photos list from marsApi.
 */
@Singleton
class NetworkMarsRepository @Inject constructor(
    private val marsApiService: MarsApiService
) : MarsRepository {
    /** Fetches list of MarsPhoto from marsApi*/
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}