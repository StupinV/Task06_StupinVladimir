package Task06_01;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private String BankName;
    private String status;
    public int sum;
    private ArrayList<Customer> customersList = new ArrayList<>();
    public int FullSum = 0;
    
    Bank(String BankName) {
        this.BankName = BankName;
    }
 
    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }
    
    List<Customer> getList(int personId){
    	List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
        	if ( personId == c.getPersonId()) {
        		FullSum = FullSum + c.getSum();
        	}
            if (c.getSum() < 0) {
                 status = "Blocked";
                 c.setStatus(status);
            }
            else {
                status = "Unblocked";
                c.setStatus(status);
            }
        }
    	for (Customer c : customersList) {
    		list.add(c);
    	}
    	System.out.println("Final sum from accounts with personal ID " + personId + " = " + FullSum);
    	return list;
    }
    
    List<Customer> getListByName(String Name2,String Name) {
        List<Customer> list1 = new ArrayList<>();
        for (Customer c : customersList) {
                    if (Name2 == c.getName2() && Name == c.getName()) {
                        list1.add(c);
                    }
                }
        return list1;
    }
    
}
