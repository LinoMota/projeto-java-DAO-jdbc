package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		Seller seller = sellerDao.findById(1);
		
		System.out.printf("Informe o id para deleção : ");
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		
		sc.close();
		
	}

}
