package com.example.veterinary.clinic.repository

import com.example.veterinary.clinic.model.FileView
import org.springframework.data.jpa.repository.JpaRepository

interface FileViewRepository : JpaRepository<FileView, Long> {
}