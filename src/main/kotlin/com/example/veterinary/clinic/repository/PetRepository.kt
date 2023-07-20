package com.example.veterinary.clinic.repository



import com.example.veterinary.clinic.model.Pet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository: JpaRepository<Pet, Long> {
    fun findById(id: Long?): Pet?
}