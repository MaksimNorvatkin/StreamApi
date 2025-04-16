package example.practica;

import example.model.Phone;

/**
 * Практика 10
 *
 */
public class Task10 {
	
	public static void main(String[] args) {
		
		Phone.getPhones().forEach(System.out::println);
		// FIXME исправь пример, чтобы он выводил название трех фирм, у которых
		// самый большой модельный ряд. Фирмы должны быть отсортированы по
		// количеству моделей.
	}
}