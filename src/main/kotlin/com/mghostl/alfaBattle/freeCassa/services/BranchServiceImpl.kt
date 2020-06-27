package com.mghostl.alfaBattle.freeCassa.services

import com.mghostl.alfaBattle.freeCassa.model.Branch
import com.mghostl.alfaBattle.freeCassa.repository.BranchRepository
import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
class BranchServiceImpl(
    private val branchRepository: BranchRepository
): BranchService {
    override fun getBranch(branchId: BigInteger): Branch? {
        return branchRepository.findById(branchId).orElse(null)
    }
}