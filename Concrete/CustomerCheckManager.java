package Day4HW.Concrete;

import Day4HW.Abstract.CustomerCheckService;
import Day4HW.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
// MernisServiceAdapter da bunun gibi çalýsacak sadece o kiþinin varlýðýan göre true veya false dönerken bu hep true döner
    @Override
    public boolean checkIfRealPerson(Customer customer) {
    	
    	return true;

    }

}