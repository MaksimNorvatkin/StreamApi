package example.practica;

import example.model.Phone;

/**
 * Практика 8
 *
 */
public class Task08 {
	
	public static void main(String[] args) {
		
		Phone.getPhones().forEach(System.out::println);
		
		// FIXME исправь пример, чтобы телефоны выводились отсортироваными по
		// цене и стоимость телефонов не привышала 10 тыс гр.
	}
}