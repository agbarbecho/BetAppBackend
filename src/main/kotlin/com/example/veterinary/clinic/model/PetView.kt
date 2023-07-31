package com.example.veterinary.clinic.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
@Entity
@Table(name ="Pet_View")

class PetView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name= "client_id")
    var clientId:Long? = null
    var name:String? = null
    var lastname:String? = null
    var address:String? = null
    var phone: Int?= null
}