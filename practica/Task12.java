package example.practica;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * Практика 12 Задание со звездочкой
 *
 * FIXME Сделать источник генерирующий декартовое произведение списка строк
 */
public class Task12 {
	
	public static void main(String[] args) {
		
		List<List<String>> input = asList(
				asList("a", "b", "c"),
				asList("x", "y"),
				asList("1", "2", "3"));

		generateCartesianProduct(input)
				.forEach(System.out::println);
	}
	public static Stream<String> generateCartesianProduct(List<List<String>> lists) {
		Stream<String> resultStream = Stream.of("");
		for (List<String> sublist : lists) {
			resultStream = resultStream.flatMap(
					str -> sublist.stream().map(element -> str + element)
			);
		}

		return resultStream;
	}
}
