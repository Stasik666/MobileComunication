package by.htp.mts.compare;

import java.util.Comparator;

import by.htp.mts.entity.Tariff;

public class ComparenNumberOfSubscribersTariff implements Comparator<Tariff>{

	@Override
	public int compare(Tariff first, Tariff second) {
		Integer firstNumber = new Integer(first.getNumberOfSubscribers());
		Integer secondNumber = new Integer(second.getNumberOfSubscribers());
		return firstNumber.compareTo(secondNumber);
	}

}
