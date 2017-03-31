package by.htp.mts.launch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

import by.htp.mts.compare.*;

import by.htp.mts.entity.*;

import by.htp.mts.menu.SimpleConsoleMenu;
import by.htp.mts.storage.ArrayListArchive;

public class Main {

	
	public static void main (String[] args){
		
		ArrayListArchive list = new ArrayListArchive();
		
		list.setList(new Simple("resource/SimpleTariff.ini"));
		list.setList(new Medium("resource/MediumTariff.ini"));
		list.setList(new Low("resource/LowTariff.ini"));
		list.setList(new High("resource/HighTariff.ini"));

		Collections.sort(list.getList(), new CompareNameTariff());
		list.print();
		Collections.sort(list.getList(), new CompareLocalCallTariff());
		list.print();
		Collections.sort(list.getList(), new ComparenNumberOfSubscribersTariff());
		list.print();
		SimpleConsoleMenu menu = new SimpleConsoleMenu();
	}
		
		
}
