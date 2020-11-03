package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		int id = 4;
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Listando todos os departamentos :");
		List<Department> deps = departmentDao.findAll();
		
		for(Department dep : deps)
			System.out.println(dep);
		
		Department department = departmentDao.findById(id);
		
		System.out.println("Encontrando um departamento especifico [id = " + id + "] :" + department);
		
		String novoNome = "coisas legais";
		
		System.out.printf("Atualizando o departamento de %s para %s ", department.getName(), novoNome);
		
		department.setName("Coisas Legais");
		departmentDao.update(department);
		
		System.out.printf("Deletando o mesmo : " + department);
		
		departmentDao.deleteById(department.getId());
		

		
	}

}
