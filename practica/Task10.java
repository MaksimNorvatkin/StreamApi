package example.practica;

import example.model.Phone;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Практика 10
 * // FIXME исправь пример, чтобы он выводил название трех фирм, у которых
 * 		// самый большой модельный ряд. Фирмы должны быть отсортированы по
 * 		// количеству моделей.
 *        }
 *
 */
public class Task10 {
	
	public static void main(String[] args) {
		
		Phone.getPhones()
				.collect(Collectors.groupingBy(Phone::getProducer, Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.limit(3)
				.map(Map.Entry::getKey)
				.forEach(System.out::println);
	}
}