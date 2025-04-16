package example.practica;

import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика 3
 */
public class Task03 {
	
	public static void main(String[] args) {
		
		Stream<Student> stream = StudentData.getPersons();
		stream.forEach(System.out::println);
		// FIXME с помошью stream APi найди средний возраст всех мужчин группы java 2
	}
}