package Day4HW;
import java.time.LocalDate;
import Day4HW.Adapters.*;
import Day4HW.Concrete.*;
import Day4HW.Entities.*;

public class Program {
	
    public static void main(String[] args){
    	try {
        	BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        	customerManager.saveDb(new Customer(1,"Özkan","Ýnönlü",LocalDate.of("yıl", "ay", "gün"),"TC kimlik"));
		}catch(Exception e) {
			System.out.println("Error : " + e.getMessage() );
		}
    	
    }
    
}
