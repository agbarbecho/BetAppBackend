package com.example.veterinary.clinic.repository


import com.example.veterinary.clinic.model.Medicine
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MedicineRepository: JpaRepository<Medicine, Long> {
    fun findById(id: Long?): Medicine?
}