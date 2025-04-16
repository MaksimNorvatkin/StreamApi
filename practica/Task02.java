package example.practica;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика3
 * // FIXME с помошью stream APi для каждой группы выведи число студентов
 * 		// младше 33 лет
 * 		// подсказка используй групировку или flatMap
 */
public class Task02 {

	public static void main(String[] args) {
		Map<String, Long> countByGroup = StudentData.getPersons()
				.filter(student -> student.getAge() < 33)
				.collect(Collectors.groupingBy(
						student -> student.getGroup().getName(),
						Collectors.counting()
				));

		countByGroup.forEach((groupName, count) ->
				System.out.println("Группа " + groupName + ": " + count + " студентов младше 33 лет")
		);
	}
}