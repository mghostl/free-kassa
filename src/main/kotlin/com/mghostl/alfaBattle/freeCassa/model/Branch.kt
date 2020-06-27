package com.mghostl.alfaBattle.freeCassa.model

import java.math.BigInteger
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "branches")
@Entity
data class Branch (
    @Id
    val id: BigInteger? = null,
    val title: String,
    val lon: Double,
    val lat: Double,
    val address: String
): Response()