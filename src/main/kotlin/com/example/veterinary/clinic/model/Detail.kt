package com.example.veterinary.clinic.model

import jakarta.persistence.*
import java.util.Date


@Entity
@Table(name = "Detail")
class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var amount:Int? = null
    @Column(name= "date_medicament")
    var dateMedicament: Date?= null
    @Column(name= "administration_time")
    var administrationTime: Date?= null
    @Column(name="medicine_id")
    var medicineId: Long? = null
    @Column(name="file_id")
    var fileId: Long? = null
    @Column(name="is_tomorrow")
    var isTomorrow: Boolean?= null
    @Column(name="is_afternoon")
    var isAfternoon: Boolean?= null
    @Column(name="is_evening")
    var isEvening: Boolean?= null
}