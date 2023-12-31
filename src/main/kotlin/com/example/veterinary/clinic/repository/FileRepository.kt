package com.example.veterinary.clinic.repository



import com.example.veterinary.clinic.model.File
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FileRepository: JpaRepository<File, Long> {
    fun findById(id: Long?): File?
}