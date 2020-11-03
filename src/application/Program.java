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
		
		
		Seller seller = sellerDao.findById(1);
		
		seller.setName("Teste");
		
		sellerDao.update(seller);
	}

}
