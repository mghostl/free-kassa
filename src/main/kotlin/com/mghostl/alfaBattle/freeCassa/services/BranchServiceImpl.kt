package com.mghostl.alfaBattle.freeCassa.services

import com.mghostl.alfaBattle.freeCassa.dto.BranchDTO
import com.mghostl.alfaBattle.freeCassa.repository.BranchRepository
import org.springframework.stereotype.Service
import java.math.BigInteger
import kotlin.math.asin
import kotlin.math.cos
import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.math.sqrt

@Service
class BranchServiceImpl(
    private val branchRepository: BranchRepository
): BranchService {

    override fun getBranch(branchId: BigInteger): BranchDTO? {
        return branchRepository.findById(branchId)
            .orElse(null).toDTO()
    }

    override fun getBranch(lon: Double, lat: Double): BranchDTO {
        return branchRepository.findAll()
            .map {
                it.toDTO()
                    .apply {
                        distance = calculateDistance(it.lat, lat, it.lon, lon)
                        println(distance.toString())
                    }
            }
            .minBy { it.distance!! }!!
    }

    private fun calculateDistance(lat1: Double, lat2: Double, lon1: Double, lon2: Double): Int {
        val arg1 = sinDifSqr(lat2, lat1)
        val arg2 = cos(lat1) * cos(lat2) * sinDifSqr(lon2, lon1)
        return round(2 * 6371000 * asin(sqrt(arg1 + arg2))).toInt()
    }

    private fun sinDifSqr(f1: Double, f2: Double) = sin((f1 - f2) / 2) * sin((f1 - f2) / 2)
}