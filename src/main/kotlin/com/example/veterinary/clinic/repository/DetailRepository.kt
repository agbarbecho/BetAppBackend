package com.example.veterinary.clinic.repository


import com.example.veterinary.clinic.model.Detail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository

interface DetailRepository: JpaRepository<Detail, Long> {
    fun findById(id: Long?): Detail?
}