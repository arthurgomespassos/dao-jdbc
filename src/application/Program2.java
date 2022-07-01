package application;

import model.dao.DaoFactory;
import model.dao.DeparmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {		

		DeparmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("---- TEST 1: department findById ----");
		Department department = departmentDao.findById(1);
		System.out.println(department);
	}

}
