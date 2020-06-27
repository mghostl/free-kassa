package com.mghostl.alfaBattle.freeCassa.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.mghostl.alfaBattle.freeCassa.model.Response
import java.math.BigInteger


@JsonInclude(value = JsonInclude.Include.NON_NULL)
data class BranchDTO(
    val id: BigInteger? = null,
    val title: String? = null,
    val lon: Double? = null,
    val lat: Double? = null,
    val address: String? = null,
    var distance: Int? = null
): Response()