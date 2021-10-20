package model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name= "Employee")
data class Employee(
    @Id

    var  id : Long =0,
    var  name : String="",
    var  age : Long =0,
    var  dept : String="",
    var salary : Long =0
)

