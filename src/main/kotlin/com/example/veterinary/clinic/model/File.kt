package com.example.veterinary.clinic.model

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "File")
class File {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "admission_date")
    var admissionDate: String? = null
    var diagnostic: String? = null
    var exams: String? = null
    @Column(name = "discharge_date")
    var dischargeDate: String? = null
    @Column(name = "vet_id")
    var vetId: Long? = null
    @Column(name = "pet_id")
    var petId: Long? = null
}