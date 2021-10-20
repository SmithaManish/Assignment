package controller

import model.Employee
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController
import repository.EmployeeRepository
import java.util.*

@RestController
@RequestMapping("/employee")
class RestController(val employeeRepository: EmployeeRepository.EmployeeRepository)
{
    @PostMapping
    fun createEmployee(@RequestBody employee: Employee): Employee {

        return employeeRepository.save(employee)
    }

    @GetMapping("/{id}")
    fun readEmployee(@PathVariable id: Long): Optional<Employee> {
        return employeeRepository.findById(id)
    }


    @PutMapping
    fun updateEmployee(@RequestBody employee: Employee)
    {
        employeeRepository.save(employee)
    }

    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id: Long)
    {
        employeeRepository.deleteById(id)
    }
}