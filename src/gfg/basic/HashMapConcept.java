/**
 * 
 */
package gfg.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
class Employee {
	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	private int id;
	private String name;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		return id == employee.id && Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "'}";
	}
}

public class HashMapConcept {
	public static void main(String[] args) {
		
		Map<Employee, String> employeeMap = new HashMap<>();

        // Creating Employee objects
        Employee emp1 = new Employee(1, "John Doe");
        Employee emp2 = new Employee(2, "Jane Smith");
        Employee emp3 = new Employee(1, "John Doe"); // Same ID and Name as emp1, so equals should return true

        // Adding employees to the HashMap
        employeeMap.put(emp1, "Software Engineer");
        employeeMap.put(emp2, "Project Manager");
        System.out.println("Employee 1's job: " + employeeMap.get(emp1)); // Should print "Software Engineer"
        System.out.println("Employee 2's job: " + employeeMap.get(emp2)); // Should print "Project Manager"

        // Checking if emp1 and emp3 are treated as the same key in the HashMap
        System.out.println("Is emp1 equal to emp3? " + emp1.equals(emp3)); // true, as they have the same id and name
        System.out.println("Employee 3's job: " + employeeMap.get(emp3)); // Should print "Software Engineer"
	}

}
