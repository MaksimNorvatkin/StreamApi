package example.practica;

import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика 6
 */
public class Task06 {
	
	public static void main(String[] args) {
		
		Stream<Student> stream = StudentData.getPersons();
		stream.forEach(System.out::println);
		// FIXME с помошью stream APi выведи имя самого старого студента
	}
}