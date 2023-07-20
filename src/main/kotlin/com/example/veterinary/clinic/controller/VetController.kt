package com.example.veterinary.clinic.controller



import com.example.veterinary.clinic.model.Detail
import com.example.veterinary.clinic.model.Vet
import com.example.veterinary.clinic.service.VetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/vet")
class VetController {
    @Autowired
    lateinit var vetService: VetService

    @GetMapping
    fun list(): ResponseEntity<*> {
        return ResponseEntity(vetService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Validated vet: Vet): ResponseEntity<Vet>{
        return ResponseEntity(vetService.save(vet), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody vet: Vet): ResponseEntity<Vet> {
        return ResponseEntity(vetService.update(vet), HttpStatus.OK)
    }
}
