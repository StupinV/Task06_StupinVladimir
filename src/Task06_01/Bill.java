package Task06_01;

import java.util.*;

import static java.util.Collections.*;
 
public class Bill {
	
	public static void main(String[] args) {
    	
		Bank megamarket = new Bank("Megamarket");
        megamarket.addCustomerToShopList(new Customer(12356, "Stupin", "Vladimir", -1000 , "Blocked"));
        megamarket.addCustomerToShopList(new Customer(12356, "Stupin", "Vladimir", 10 , "Unblocked"));
        megamarket.addCustomerToShopList(new Customer(87543, "Minkov", "Alex", 1990 , "Unblocked"));      
 
        System.out.println("Customers accounts : ");
        List<Customer> list = megamarket.getList(12356);
        for (Customer c : list) {
            System.out.println(c);
        }
        
        System.out.println("\nAcount(s) with this Second name and name : ");
        List<Customer> listSortByName = megamarket.getListByName("Stupin", "Vladimir");
        for (Customer b : listSortByName) {
            System.out.println(b);
        }    
        
    }
	
}