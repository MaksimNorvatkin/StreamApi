package example.practica;

import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика
 */
public class Task02 {
	
	public static void main(String[] args) {
		
		Stream<Student> stream = StudentData.getPersons();
		stream.forEach(System.out::println);
		// FIXME с помошью stream APi для каждой группы выведи число студентов
		// младше 33 лет
		// подсказка используй групировку или flatMap
	}
}