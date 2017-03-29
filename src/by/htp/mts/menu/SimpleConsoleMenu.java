package by.htp.mts.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import by.htp.mts.entity.*;
import by.htp.mts.storage.ArrayArchive;

public class SimpleConsoleMenu {
	{
		ArrayArchive arc = new ArrayArchive();
		
		arc.addTariff(new Simple("resource/SimpleTariff.ini"));
		arc.addTariff(new Medium("resource/MediumTariff.ini"));
		arc.addTariff(new Low("resource/LowTariff.ini"));
		arc.addTariff(new High("resource/HighTariff.ini"));
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x=2;
		while(x==2){
			System.out.println("Please, enter the command number"+"\n"+"1)Print the tariffs list"+"\n"+"2)To calculate the total number"
					+ " of customers."+"\n"+"3)Sort of tariffs based on the amount of the subscription fee."+"\n"+"4)To find the rate, the company matches a specified "
							+ "range of parameters."+"\n" + "5)Exit the programm");
			try{
				int y = Integer.parseInt(reader.readLine());
				 
				if(y==1){
					arc.printTariffs();
					continue;}
				else 	if(y==2){
					arc.calculateCustomers();
					continue;}
				else	if(y==3){
					arc.sortTariffBySubscriptionFee();
					continue;}	
				else if(y==4){
					System.out.println("Please, enter the minimum value of the parameter");
					double min = Double.parseDouble(reader.readLine());
					System.out.println("Please, enter the maximum value of the parameter");
					double max = Double.parseDouble(reader.readLine());
					for(int i = 0;i<arc.getList().length;i++){
						if(arc.getList()[i].getOtherNetworkCall()>=min && arc.getList()[i].getOtherNetworkCall()<=max)
							System.out.println(arc.getList()[i].toString());
					}
					continue;}
				else	if(y==5){
					System.out.println("Good bye!");
					System.exit(0);}
				else	
					System.out.println("Invalid number"+"\n");
					continue;
			}
			catch(Exception e){
				System.out.println("Invalid number"+"\n");
				continue;
			}
			
		}
	}
}
