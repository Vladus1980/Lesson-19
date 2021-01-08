package Ex01;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		File fileEmployee = new File("Employee.obj");
		Employee employee = new Employee("Valyl", 12, 12542.25);
		System.out.println(employee);
		
		Metods.serialize(fileEmployee, employee);
		System.out.println(Metods.deserialize(fileEmployee));
		
		File fileEmployeeList = new File("EmployeeList.obj");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee);
		employeeList.add(new Employee("Sergiy", 55, 12524.25));
		employeeList.add(new Employee("Valerij", 87, 13564.25));
		employeeList.add(new Employee("Olehandro", 88, 8544.25));
		employeeList.add(new Employee("Abram", 89, 9554.25));
		employeeList.add(new Employee("Pedro", 90, 10225.25));
		
		for (Employee employee2 : employeeList) {
			System.out.println(employee2);
		}
		System.out.println();
		
		Metods.serialize(fileEmployeeList, (Serializable) employeeList);
		
		List<Employee> employeeListDeserialize = new ArrayList<Employee>();
		employeeListDeserialize = (List<Employee>) Metods.deserialize(fileEmployeeList);
		for (Employee employee2 : employeeListDeserialize) {
			System.out.println(employee2);
		}
		

	}

}
