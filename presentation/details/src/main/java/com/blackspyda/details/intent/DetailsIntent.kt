package com.blackspyda.details.intent

sealed class DetailsIntent {
    data class GetDetails(val name: String) : DetailsIntent()
}