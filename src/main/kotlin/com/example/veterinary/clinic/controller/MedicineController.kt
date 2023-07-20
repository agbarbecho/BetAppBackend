package com.example.veterinary.clinic.controller


import com.example.veterinary.clinic.model.Client
import com.example.veterinary.clinic.model.Detail
import com.example.veterinary.clinic.model.Medicine
import com.example.veterinary.clinic.service.MedicineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/medicine")
class MedicineController {
    @Autowired
    lateinit var medicineService: MedicineService

    @GetMapping
    fun list(): ResponseEntity<*> {
        return ResponseEntity(medicineService.list(), HttpStatus.OK)
    }
    @PostMapping
    fun save (@RequestBody @Validated medicine: Medicine): ResponseEntity<Medicine>{
        return ResponseEntity(medicineService.save(medicine), HttpStatus.OK)
    }
    @PutMapping
    fun update (@RequestBody medicine: Medicine): ResponseEntity<Medicine> {
        return ResponseEntity(medicineService.update(medicine), HttpStatus.OK)
    }
}
