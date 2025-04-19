package example.practica;

import example.model.Phone;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Практика 9
 * // FIXME исправь пример, чтобы он выводил только самые дорогие телефоны
 * 		// каждого производителя
 *
 */
public class Task09 {
	
	public static void main(String[] args) {

		Phone.getPhones()
				.collect(Collectors.groupingBy(
						Phone::getProducer,
						Collectors.maxBy(Comparator.comparing(Phone::getPrice))
				))
				.values()
				.stream()
				.filter(Optional::isPresent)
				.map(Optional::get)
				.forEach(System.out::println);
	}
}