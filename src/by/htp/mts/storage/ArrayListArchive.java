package by.htp.mts.storage;

import java.util.ArrayList;

import by.htp.mts.entity.Tariff;

public class ArrayListArchive {
	
	private static ArrayList<Tariff> list= new ArrayList<Tariff>();

	public  ArrayList<Tariff> getList() {
		return list;
	}

	public void setList(Tariff newTariff) {
		list.add(newTariff);
	}
	public void print(){
		for(Tariff x: list){
			System.out.println(x);
		}
	System.out.println("");
	}
}
