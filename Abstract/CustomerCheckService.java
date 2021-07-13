package Day4HW.Abstract;

import Day4HW.Entities.Customer;

public interface CustomerCheckService {
	
    public boolean checkIfRealPerson(Customer customer);
}
