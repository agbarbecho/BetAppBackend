package com.example.veterinary.clinic.service


import com.example.veterinary.clinic.model.File
import com.example.veterinary.clinic.model.Pet
import com.example.veterinary.clinic.repository.PetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class PetService {
    @Autowired
    lateinit var petRepository: PetRepository

    fun list(): List<Pet>{
        return petRepository.findAll()
    }

    fun save(pet: Pet): Pet {
        return petRepository.save(pet)

    }
    fun update(pet: Pet): Pet {
        try {
            petRepository.findById(pet.id)
                ?: throw Exception("ID no existe")

            return petRepository.save(pet)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}