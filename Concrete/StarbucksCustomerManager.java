package Day4HW.Concrete;

import Day4HW.Abstract.CustomerCheckService;
import Day4HW.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){

        this.customerCheckService=customerCheckService;
    }

    public void saveDb(Customer customer){

        if(customerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Saved into db : " + customer.getFirstName());
        }
        else{
            System.out.println("Not a valid person");
        }
    }

}