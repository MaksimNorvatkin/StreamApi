package example.practica;

import static java.util.Arrays.asList;

import java.util.List;

/**
 * Практика 12 Задание со звездочкой
 *
 */
public class Task12 {
	
	public static void main(String[] args) {
		
		List<List<String>> input = asList(asList("a", "b", "c"), asList("x", "y"), asList("1", "2", "3"));
		input.stream().count();
		
		// FIXME Сделать источник генерирующий декартовое произведение списка строк
	}
}