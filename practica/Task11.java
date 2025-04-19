package example.practica;

import example.model.Phone;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Практика 11
 * // FIXME выведи название моделей (без производителя) 5 самых дешевых
 * 		// телефонов, отсортированных по
 * 		// возрастанию цены
 *
 */
public class Task11 {
	
	public static void main(String[] args) {

		Phone.getPhones()
				.sorted(Comparator.comparing(Phone::getPrice))
				.map(Phone::getModel)
				.limit(5)
				.forEach(System.out::println);
	}
}