/**
 * 
 */
package gfg.basic;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee1 {
	private final String name;
	private final Date dob;
	private final Address address;

	public Employee1(String name, Date dob, Address address) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, dob, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(address, other.address) && Objects.equals(dob, other.dob)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}
	
}

class Address {
	private final String city;

	public String getCity() {
		return city;
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city);
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
}

public class HashMapConcept1 {
	public static void main(String[] args) {
		Address address=new Address("Patna");
		Address addres1=new Address("NOida");
		Employee1 employee1 = new Employee1("Rajan", new Date(), address);
        Employee1 employee2 = new Employee1("Radha", new Date(), addres1);
        
        Map<Employee1, String>employeemap=new HashMap<>();
        employeemap.put(employee1, "Software Engineer");
        employeemap.put(employee2, "Product Manager");
        System.out.println("  map "+employeemap);
	}
}
