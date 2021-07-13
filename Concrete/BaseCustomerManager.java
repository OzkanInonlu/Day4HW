package Day4HW.Concrete;

import Day4HW.Abstract.CustomerService;
import Day4HW.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

    @Override
    public void saveDb(Customer customer){
        System.out.println("Saved into db : " + customer.getFirstName() + " " + customer.getLastName());
    }
    
}