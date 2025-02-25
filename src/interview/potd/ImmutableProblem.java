/**
 * 
 */
package interview.potd;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class ImmutableProblem {
	public static final class Person {
		private final String name;
		private final int age;
		private final Date dob;
		private final City city;
		public Person(String name, int age, Date dob, City city) {
			this.name = name;
			this.age = age;
			this.dob = new Date(dob.getTime());
			this.city = new City(city.getName(), city.getState());
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public Date getDob() {
			return dob;
		}
		public City getCity() {
			return city;
		}
		@Override
		public int hashCode() {
			return Objects.hash(age, city, dob, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return age == other.age && Objects.equals(city, other.city) && Objects.equals(dob, other.dob)
					&& Objects.equals(name, other.name);
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", dob=" + dob + ", city=" + city + "]";
		}
	}
	public static final class City {
		private final String name;
		private final String state;
		public City(String name, String state) {
			this.name = name;
			this.state = state;
		}
		public String getName() {
			return name;
		}
		public String getState() {
			return state;
		}
		@Override
		public int hashCode() {
			return Objects.hash(name, state);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			City other = (City) obj;
			return Objects.equals(name, other.name) && Objects.equals(state, other.state);
		}
		@Override
		public String toString() {
			return "City [name=" + name + ", state=" + state + "]";
		}
	}
	public static void main(String[] args) {
		City city=new City("patna", "bihar");
		City city1=new City("Noida", "up");
		
		Person immutableProblem=new Person("rajan",25,new Date(),city);
		Person immutableProblem1=new Person("nidhi",30,new Date(),city1);
		Person immutableProblem2=new Person("rani",40,new Date(),city);
		
		Map<Person, String>map=new HashMap<>();
		map.put(immutableProblem2, "east champarn");
		map.put(immutableProblem1, "gorakhpur");
		map.put(immutableProblem, "noida");
		System.out.println("contents :- "+map);
	}
}
