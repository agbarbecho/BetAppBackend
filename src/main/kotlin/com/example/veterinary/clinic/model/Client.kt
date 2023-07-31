package com.example.veterinary.clinic.model

import jakarta.persistence.*


@Entity
@Table(name = "Client")
class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
    var lastname:String? =null
    var address:String? = null
    var phone: Int?= null
}