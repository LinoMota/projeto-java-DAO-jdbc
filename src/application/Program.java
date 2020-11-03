package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		Seller seller = new Seller();
		seller.setBaseSalary(2500.0);
		seller.setName("Linus");
		seller.setEmail("lcmn@icomp.edu.br");
		seller.setBirthDate(new Date());
		seller.setDepartment(new Department(2, null));
		
		sellerDao.insert(seller);
	}

}
