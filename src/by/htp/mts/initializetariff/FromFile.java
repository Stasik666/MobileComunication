package by.htp.mts.initializetariff;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import by.htp.mts.entity.Tariff;

public abstract class FromFile{
	
	public FromFile()  {
		
	}
	
	public  static void readData(Tariff newTariff,String path){
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
			newTariff.setName(props.getProperty("name"));
			newTariff.setSubscriptionFee(Double.parseDouble(props.getProperty("subscriptionFee")));
			newTariff.setInternetTraffic(Integer.parseInt(props.getProperty("internetTraffic")));
			newTariff.setLocalCall(Double.parseDouble(props.getProperty("localCall")));
			newTariff.setOtherNetworkCall(Double.parseDouble(props.getProperty("otherNetworkCall")));
			newTariff.setNumberOfSubscribers(Integer.parseInt(props.getProperty("numberOfSubscribers")));
		}
		catch (IOException e) {
			System.err.println("Error: file not found!");
		}
	}
}
