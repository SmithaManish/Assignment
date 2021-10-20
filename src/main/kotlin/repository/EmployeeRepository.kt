package repository
import model.Employee
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

class EmployeeRepository {
    @Repository
    interface EmployeeRepository : CrudRepository<Employee, Long>
    {



    }
}