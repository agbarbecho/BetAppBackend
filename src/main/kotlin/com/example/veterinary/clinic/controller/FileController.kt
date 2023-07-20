package com.example.veterinary.clinic.controller

import com.example.veterinary.clinic.model.Client
import com.example.veterinary.clinic.model.File
import com.example.veterinary.clinic.service.DetailService
import com.example.veterinary.clinic.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/file")
class FileController {
    @Autowired
    lateinit var fileService: FileService

    @GetMapping
    fun list(): ResponseEntity<*> {
        return ResponseEntity(fileService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Validated file: File): ResponseEntity<File>{
        return ResponseEntity(fileService.save(file), HttpStatus.OK)
    }
}