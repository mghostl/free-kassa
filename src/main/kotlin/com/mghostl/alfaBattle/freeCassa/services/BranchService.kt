package com.mghostl.alfaBattle.freeCassa.services

import com.mghostl.alfaBattle.freeCassa.model.Branch
import java.math.BigInteger

interface BranchService {
    fun getBranch(branchId: BigInteger): Branch?
}