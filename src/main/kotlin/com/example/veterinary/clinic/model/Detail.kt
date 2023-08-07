package com.example.veterinary.clinic.model

import jakarta.persistence.*


@Entity
@Table(name = "Detail")
class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var amount:Int? = null
    @Column(name= "date_medicament")
    var dateMedicament: String?= null
    @Column(name= "administration_time")
    var administrationTime: String?= null
    var tomorrow: String?= null
    var afternoon: String?= null
    var evening: String?= null
    @Column(name="medicine_id")
    var medicineId: Long? = null
    @Column(name="file_id")
    var fileId: Long? = null
}