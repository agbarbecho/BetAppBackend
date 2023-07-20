package com.example.veterinary.clinic.service


import com.example.veterinary.clinic.model.Detail
import com.example.veterinary.clinic.model.File
import com.example.veterinary.clinic.repository.FileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class FileService {
    @Autowired
    lateinit var fileRepository: FileRepository

    fun list(): List<File>{
        return fileRepository.findAll()
    }

    fun save(file: File): File{
        return fileRepository.save(file)

    }
    fun update(file: File): File {
        try {
            fileRepository.findById(file.id)
                ?: throw Exception("ID no existe")

            return fileRepository.save(file)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}