package com.example.veterinary.clinic.model

import jakarta.persistence.*
import java.util.*
@Entity
@Table(name = "Detail_View")
class DetailView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name= "medicine_id")
    var medicineId: Long? = null
    var description: String? = null
    @Column(name= "expiration_date")
    var expirationDate: Date? = null
    @Column(name= "file_id")
    var fileId: Long? = null
    @Column(name= "admission_date")
    var admissionDate: Date? = null
    var diagnostic: String? = null
    var exams: String? = null
    @Column(name= "discharge_date")
    var dischargeDate: Date? = null
}