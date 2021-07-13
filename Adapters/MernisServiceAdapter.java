package Day4HW.Adapters;


import Day4HW.Abstract.CustomerCheckService;
import Day4HW.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		//client.TCKimlikNoDogrula("Tc kimlik","ad","soyad","doðum yýlý");
		 							//long   String   String	int	
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		boolean result=true;
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear()
					);
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
		return result;
			
	}

	
}
