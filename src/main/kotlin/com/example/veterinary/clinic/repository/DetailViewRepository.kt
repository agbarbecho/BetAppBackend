package com.example.veterinary.clinic.repository

import com.example.veterinary.clinic.model.DetailView
import org.springframework.data.jpa.repository.JpaRepository

interface DetailViewRepository : JpaRepository <DetailView, Long> {
}