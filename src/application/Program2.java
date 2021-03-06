package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DeparmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {		

		DeparmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("---- TEST 1: department findById ----");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n---- TEST 2: department findAll ----");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n---- TEST 3: department insert ----");
		Department newDepartment = new Department(null, "Health");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("---- TEST 4: department update ----");
		department.setName("Tablets");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("---- TEST 6: department deleteById ----");
		departmentDao.deleteById(7);
		System.out.println("Delete Completed");
	}

}
