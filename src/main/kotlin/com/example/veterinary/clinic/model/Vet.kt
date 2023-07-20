package com.example.veterinary.clinic.model

import jakarta.persistence.*

@Entity
@Table(name = "Vet")
class Vet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
}