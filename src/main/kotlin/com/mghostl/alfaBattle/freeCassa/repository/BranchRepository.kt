package com.mghostl.alfaBattle.freeCassa.repository

import com.mghostl.alfaBattle.freeCassa.model.Branch
import org.springframework.data.jpa.repository.JpaRepository
import java.math.BigInteger

interface BranchRepository: JpaRepository<Branch, BigInteger> {
}