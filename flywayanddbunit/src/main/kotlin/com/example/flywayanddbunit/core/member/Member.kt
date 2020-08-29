package com.example.flywayanddbunit.core.member

import com.example.flywayanddbunit.core.team.Team
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Member(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    var name: String,

    @Column
    var age: Long,

    @ManyToOne
    var team: Team
)