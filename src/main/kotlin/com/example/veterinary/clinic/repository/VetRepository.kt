package com.example.veterinary.clinic.repository


import com.example.veterinary.clinic.model.Vet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VetRepository: JpaRepository<Vet, Long> {
    fun findById(id: Long?): Vet?
}