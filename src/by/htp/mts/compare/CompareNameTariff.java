package by.htp.mts.compare;

import java.util.Comparator;
import by.htp.mts.entity.Tariff;

public class CompareNameTariff implements Comparator<Tariff>{

	@Override
	public int compare(Tariff first, Tariff second) {
		return first.getName().compareTo(second.getName());
	}

}
