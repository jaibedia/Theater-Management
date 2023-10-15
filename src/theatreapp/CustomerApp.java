package theatreapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Factory.ConnectionFactory;
import com.Factory.CustomerServiceFactory;
import com.theatre.dto.Customer;
import com.theatre.service.CustomerService;

public class CustomerApp {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println();
			System.out.println("===========Customer Module==========");
			System.out.println("\t1.Add customer.");
			System.out.println("\t2.Search customer.");
			System.out.println("\t3.Exit.");
			String cId;
			String cName;
			String cAge;
			String cGender;
			String mobNumber;
			String cAddress;
			Customer customer=null;
			CustomerService customerService;
			System.out.print("\t Your option [1,2,3]. : ");
			String input = br.readLine();
			int option = Integer.parseInt(input);
			switch(option) {
				case 1:
					System.out.println("\n=========Customer Add Module=====");
					System.out.print("\tEnter customer Id          : ");
					cId = br.readLine();
					System.out.print("\tEnter customer name        : ");
					cName = br.readLine();
					System.out.print("\tEnter customer age         : ");
					cAge = br.readLine();
					System.out.print("\tEnter customer mobile      : ");
					mobNumber= br.readLine();
					System.out.print("\tEnter customer gender[m/f] : ");
					cGender = br.readLine();
					System.out.print("\tEnter customer address     : ");
					cAddress = br.readLine();
					customer = new Customer();
					customer.setcId(cId);
					customer.setcName(cName);
					customer.setcAge(cAge);
					customer.setMobNumber(mobNumber);
					customer.setGender(cGender);
					customer.setAddress(cAddress);
					customerService =CustomerServiceFactory.getCustomerService();
					String status = customerService.addCustomer(customer);
					System.out.println(status);
					break;
				case 2:
					System.out.println("\n=============Customer search Module============");
					System.out.print("\n\tEnter customer Id : ");
					cId = br.readLine();
					customerService = CustomerServiceFactory.getCustomerService();
					customer = customerService.searchCustomer(cId);
					if(customer==null) {
						System.out.println("customer not existed..");
					}else {
						System.out.println("=========customer details=======");
						System.out.print("\ncustomer Id      :"+customer.getcId());
						System.out.print("\ncustomer name    :"+customer.getcName());
						System.out.print("\ncustomer age     :"+customer.getcAge());
						System.out.print("\ncustomer gender  :"+customer.getGender());
						System.out.print("\ncustomer Mobile  :"+customer.getMobNumber());
						System.out.print("\ncustomer address :"+customer.getAddress());
					}
					break;
				case 3:
					System.out.println("===========Thank You========");
					ConnectionFactory.cleanUp();
					System.exit(0);
					break;
				default:
					System.out.println("please select available option only");
					break;
			}
		}
	}
}
