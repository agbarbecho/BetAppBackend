package com.example.veterinary.clinic.model

import jakarta.persistence.*

@Entity
@Table(name ="File_View")

class FileView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name= "vet_id")
    var vetId: Long? = null
    var lastname:String? = null
    @Column(name= "pet_id")
    var name:String? = null
    var breed:String? = null
    var species: String?= null
}