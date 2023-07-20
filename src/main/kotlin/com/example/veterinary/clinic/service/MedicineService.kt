package com.example.veterinary.clinic.service


import com.example.veterinary.clinic.model.File
import com.example.veterinary.clinic.model.Medicine
import com.example.veterinary.clinic.model.Vet
import com.example.veterinary.clinic.repository.MedicineRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class MedicineService {
    @Autowired
    lateinit var medicineRepository: MedicineRepository

    fun list(): List<Medicine> {
        return medicineRepository.findAll()
    }

    fun save(medicine: Medicine): Medicine {
        return medicineRepository.save(medicine)

    }

    fun update(medicine: Medicine): Medicine {
        try {
            medicineRepository.findById(medicine.id)
                ?: throw Exception("ID no existe")

            return medicineRepository.save(medicine)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}