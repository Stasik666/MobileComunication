package by.htp.mts.compare;

import java.util.Comparator;

import by.htp.mts.entity.Tariff;

public class CompareLocalCallTariff implements Comparator<Tariff>{

	@Override
	public int compare(Tariff first, Tariff second) {
		Double firstNumber = new Double(first.getLocalCall());
		Double secondNumber = new Double(second.getLocalCall());
		return firstNumber.compareTo(secondNumber);
	}

}
