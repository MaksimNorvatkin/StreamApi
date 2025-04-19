package example.practica;

import example.model.Phone;

import java.util.Comparator;

/**
 * Практика 8
 * 	// FIXME исправь пример, чтобы телефоны выводились отсортироваными по
 * 		// цене и стоимость телефонов не привышала 10 тыс гр.
 *
 */
public class Task08 {
	
	public static void main(String[] args) {
		
		Phone.getPhones()
				.filter(phone -> phone.getPrice() < 10000)
				.sorted(Comparator.comparing(Phone::getPrice))
				.forEach(System.out::println);
		

	}
}