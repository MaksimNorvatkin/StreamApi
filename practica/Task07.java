package example.practica;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Практика 7 Вывести таблицу умножения используя только stream API.
 *
 */
public class Task07 {
	
	public static void main(String[] args) {

		IntStream.rangeClosed(2, 9)
				.boxed()
				.flatMap(a -> IntStream.rangeClosed(2, 9)
						// Преобразуем пару чисел в строку "a * b = результат"
						.mapToObj(b -> String.format("%d * %d = %d", a, b, a * b))
				)
				.forEach(System.out::println);
	}
}