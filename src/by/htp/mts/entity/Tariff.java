package by.htp.mts.entity;

import by.htp.mts.initializetariff.*;

public abstract class Tariff {
	private String name;
	private double subscriptionFee;
	private int internetTraffic;
	private double localCall;
	private double otherNetworkCall;
	private int numberOfSubscribers;
	
	public Tariff(){
		
	}
	
	public Tariff(String path){	
		FromFile.readData(this,path);
	}
	
	@Override
	public String toString() {
		return "Tariff name=" + name + ", SubscriptionFee=" + subscriptionFee + ", InternetTraffic=" + internetTraffic
				+ ", localCall=" + localCall + ", otherNetworkCall=" + otherNetworkCall + ", numberOfSubscribers="
				+ numberOfSubscribers;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + internetTraffic;
		long temp;
		temp = Double.doubleToLongBits(localCall);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfSubscribers;
		temp = Double.doubleToLongBits(otherNetworkCall);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(subscriptionFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tariff other = (Tariff) obj;
		if (internetTraffic != other.internetTraffic)
			return false;
		if (Double.doubleToLongBits(localCall) != Double.doubleToLongBits(other.localCall))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfSubscribers != other.numberOfSubscribers)
			return false;
		if (Double.doubleToLongBits(otherNetworkCall) != Double.doubleToLongBits(other.otherNetworkCall))
			return false;
		if (Double.doubleToLongBits(subscriptionFee) != Double.doubleToLongBits(other.subscriptionFee))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSubscriptionFee() {
		return subscriptionFee;
	}
	public void setSubscriptionFee(double subscriptionFee) {
		this.subscriptionFee = subscriptionFee;
	}
	public int getInternetTraffic() {
		return internetTraffic;
	}
	public void setInternetTraffic(int internetTraffic) {
		this.internetTraffic = internetTraffic;
	}
	public double getLocalCall() {
		return localCall;
	}
	public void setLocalCall(double localCall) {
		this.localCall = localCall;
	}
	public double getOtherNetworkCall() {
		return otherNetworkCall;
	}
	public void setOtherNetworkCall(double otherNetworkCall) {
		this.otherNetworkCall = otherNetworkCall;
	}
	public int getNumberOfSubscribers() {
		return numberOfSubscribers;
	}
	public void setNumberOfSubscribers(int numberOfSubscribers) {
		this.numberOfSubscribers = numberOfSubscribers;
	}
}

