package by.htp.mts.storage;

import by.htp.mts.entity.Tariff;

public class ArrayArchive {
	private Tariff[] list;
	private int initialSize = 10;
	
	public ArrayArchive(){
		list = new Tariff[initialSize];
	}
	public ArrayArchive(int initialSize){
		list = new Tariff[initialSize];
	}

	public Tariff[] getList() {
		return list;
	}

	public void setList(Tariff[] list) {
		if(list!=null)
		this.list = list;
	}
	public void addTariff(Tariff newTariff){
		int emptyCount=0;
		for(int x = 0;x<list.length;x++){
			if(list[x]==null)
				emptyCount++;
		}
		if(emptyCount>0){
			for(int i = 0; i<list.length;i++){
				if(list[i]==null){
					list[i]=newTariff;
					break;	
				}
			}
		}	
		else{
			Tariff[] newArray = new Tariff[list.length+1];
			for(int i = 0;i < list.length;i++){
				newArray[i] = list[i];
			}
			newArray[list.length] = newTariff;
			list = newArray;
		}
	}
	public void removeTariff(String name ){
		for(int i = 0;i<list.length;i++){
			if(name.equals(list[i].getName())){
				Tariff[] newArray = new Tariff[list.length-1];
				for(int j =i;j<list.length-1;j++){
					Tariff t = list[j];
					list[j+1] = list[j];
					list[j] = t;
				}
				for(int k = 0;k<newArray.length;k++){
					newArray[k] = list[k];
				}
				list = newArray;	
			}		
		}
	}
	public void printTariffs(){
		for (int i = 0;i<list.length;i++){
			if(list[i]!=null){
			System.out.println(list[i].toString());
			}
		}
		System.out.println("");
	}
	public void calculateCustomers(){
		int sum =0;
		for(Tariff tariff:list){
			if(tariff!=null){
			sum+=tariff.getNumberOfSubscribers();}
		}
		System.out.println(sum);
	}
	public void sortTariffBySubscriptionFee(){
		Tariff[] newArray = list;
		Tariff t;
		int max;
		for(int i = 0;i<newArray.length;i++){
			max = i;
			for(int j = i+1;j<newArray.length;j++){
				if(newArray[j].getSubscriptionFee()<newArray[max].getSubscriptionFee())
					max = j; 
			}
			t = newArray[i];
			newArray[i] = newArray[max];
			newArray[max] =  t;
		}
		for(int i = 0;i<newArray.length;i++){
			System.out.println(newArray[i].toString());
		}
		System.out.println("");
	}
	
	
	
}