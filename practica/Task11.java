package example.practica;

import example.model.Phone;

/**
 * Практика 11
 *
 */
public class Task11 {
	
	public static void main(String[] args) {
		
		Phone.getPhones().forEach(System.out::println);
		// FIXME выведи название моделей (без производителя) 5 самых дешевых
		// телефонов, отсортированных по
		// возрастанию цены
	}
}