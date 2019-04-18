package rest.api.demo;

import java.util.Scanner;

import org.json.JSONException;
import io.restassured.specification.RequestSpecification;
import rest.api.actions.CommonActions;
import rest.api.props.BaseProperties;

public class Demo {
	
	public static RequestSpecification httpRequest;

	public static void main(String[] args)throws JSONException  {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		
		do {
			System.out.println("Press 1 :Using Name" );
			System.out.println("Press 2 :Using Code" );
			System.out.println("Press 3 :Exit" );
			
			System.out.println("Please Enter Your Choice: ");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.print("Please Enter Country Name: " );
				String byName = scan.nextLine();				 
				
				String name = BaseProperties.NAME_END_POINT + byName;				
				System.out.println("Capital is =>  " + CommonActions.getResponseByName(name) + "\n\n");				
				break;
				
			case 2:
				System.out.print("Please Enter Country Code: " );
				String byCode = scan.nextLine();
				
				String code = BaseProperties.CODE_END_POINT + byCode;		 
				System.out.println("Capital is =>  " + CommonActions.getResponseByCode(code) + "\n\n");				
				break;
				
			case 3:
				System.out.println("BYE... ");
				System.exit(0);				
				
			default:
				System.out.println("Wrong Choice. Please Try Again... ");			
			}
			
		}while(choice !=3);
		
			scan.close();
	}
	
	
	
	

}
