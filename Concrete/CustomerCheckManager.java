package Day4HW.Concrete;

import Day4HW.Abstract.CustomerCheckService;
import Day4HW.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
// MernisServiceAdapter da bunun gibi �al�sacak sadece o ki�inin varl���an g�re true veya false d�nerken bu hep true d�ner
    @Override
    public boolean checkIfRealPerson(Customer customer) {
    	
    	return true;

    }

}