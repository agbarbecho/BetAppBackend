package com.example.veterinary.clinic.service


import com.example.veterinary.clinic.model.Detail
import com.example.veterinary.clinic.model.DetailView
import com.example.veterinary.clinic.model.Pet
import com.example.veterinary.clinic.model.PetView
import com.example.veterinary.clinic.repository.DetailRepository
import com.example.veterinary.clinic.repository.DetailViewRepository
import com.example.veterinary.clinic.repository.PetViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class DetailService {
    @Autowired
    lateinit var detailRepository: DetailRepository

    @Autowired
    lateinit var detailViewRepository: DetailViewRepository

    fun list(): List<Detail>{
        return detailRepository.findAll()
    }

    fun listDetailMedicineFile(): List<DetailView>{
        return detailViewRepository.findAll()
    }
    fun save(detail: Detail): Detail {
        return detailRepository.save(detail)

    }

    fun update(detail: Detail): Detail {
        try {
            detailRepository.findById(detail.id)
                ?: throw Exception("ID no existe")

            return detailRepository.save(detail)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}