package com.example.veterinary.clinic.repository


import com.example.veterinary.clinic.model.PetView
import org.springframework.data.jpa.repository.JpaRepository

interface PetViewRepository: JpaRepository<PetView, Long> {
}