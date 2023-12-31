package com.example.veterinary.clinic.controller



import com.example.veterinary.clinic.model.Pet
import com.example.veterinary.clinic.model.PetView
import com.example.veterinary.clinic.repository.PetViewRepository
import com.example.veterinary.clinic.service.PetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/pet")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class PetController {
    @Autowired
    lateinit var petService: PetService

    @GetMapping
    fun list(): ResponseEntity<*> {
        return ResponseEntity(petService.list(), HttpStatus.OK)
    }

    @GetMapping("pet-client")
    fun listPetClient(): List<PetView>{
        return petService.listPetClient()
    }

    @PostMapping
    fun save (@RequestBody @Validated pet: Pet): ResponseEntity<Pet>{
        return ResponseEntity(petService.save(pet), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody pet: Pet): ResponseEntity<Pet> {
        return ResponseEntity(petService.update(pet), HttpStatus.OK)
    }

}

