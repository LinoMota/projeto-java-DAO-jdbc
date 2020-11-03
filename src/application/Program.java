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
		
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findAll();
		
		for(Seller seller : list)
			System.out.println(seller);
	}

}
