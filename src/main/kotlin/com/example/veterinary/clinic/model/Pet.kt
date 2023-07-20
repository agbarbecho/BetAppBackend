package com.example.veterinary.clinic.model

import jakarta.persistence.*

@Entity
@Table(name = "Pet")
class Pet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
    var breed:String? = null
    var species: String?= null
    @Column(name="client_id")
    var clientId: Long? = null
}