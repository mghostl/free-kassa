package com.mghostl.alfaBattle.freeCassa.controllers

import com.mghostl.alfaBattle.freeCassa.model.ErrorResponse
import com.mghostl.alfaBattle.freeCassa.model.Response
import com.mghostl.alfaBattle.freeCassa.services.BranchService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@RequestMapping("/branches")
class BranchController (
    private val branchService: BranchService
){

    @GetMapping("/{branchId}")
    fun getBranch(@PathVariable  branchId: BigInteger): ResponseEntity<Response> {
        val branch = branchService.getBranch(branchId)?: return ResponseEntity(ErrorResponse("branch not found"), HttpStatus.NOT_FOUND)
        return ResponseEntity.ok(branch)
    }
}