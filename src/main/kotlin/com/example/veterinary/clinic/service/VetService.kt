package com.example.veterinary.clinic.service


import com.example.veterinary.clinic.model.File
import com.example.veterinary.clinic.model.Vet
import com.example.veterinary.clinic.repository.VetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class VetService {
    @Autowired
    lateinit var vetRepository: VetRepository

    fun list(): List<Vet>{
        return vetRepository.findAll()
    }

    fun save(vet: Vet): Vet {
        return vetRepository.save(vet)
    }
    fun update(vet: Vet): Vet{
        try {
            vetRepository.findById(vet.id)
                ?: throw Exception("ID no existe")

            return vetRepository.save(vet)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}