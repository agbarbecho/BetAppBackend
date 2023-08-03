package com.example.veterinary.clinic.controller


import com.example.veterinary.clinic.model.File
import com.example.veterinary.clinic.model.FileView

import com.example.veterinary.clinic.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/file")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class FileController {
    @Autowired
    lateinit var fileService: FileService

    @GetMapping
    fun list(): ResponseEntity<*> {
        return ResponseEntity(fileService.list(), HttpStatus.OK)
    }

    @GetMapping("file-pet-vet")
    fun listFilePetVet(): List<FileView>{
        return fileService.listFileVetPet()
    }

    @PostMapping
    fun save (@RequestBody @Validated file: File): ResponseEntity<File>{
        return ResponseEntity(fileService.save(file), HttpStatus.OK)
    }
    @PutMapping
    fun update (@RequestBody file: File): ResponseEntity<File> {
        return ResponseEntity(fileService.update(file), HttpStatus.OK)
    }
}
