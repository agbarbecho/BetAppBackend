package com.example.veterinary.clinic.model

import jakarta.persistence.*
import java.util.Date


@Entity
@Table(name = "Medicine")
class Medicine {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name: String? = null
    var description: String? = null
    @Column(name= "expiration_date")
    var expirationDate: Date? = null


}