package example.practica;

import example.model.Phone;

/**
 * Практика 9
 *
 */
public class Task09 {
	
	public static void main(String[] args) {
		
		Phone.getPhones().forEach(System.out::println);
		// FIXME исправь пример, чтобы он выводил только самые дорогие телефоны
		// каждого производителя
	}
}