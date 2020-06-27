package com.mghostl.alfaBattle.freeCassa.model

import com.mghostl.alfaBattle.freeCassa.dto.BranchDTO
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
) {
    fun toDTO(): BranchDTO =
        BranchDTO(id, title, lon, lat, address, null)
}
// todo add mapstruct
