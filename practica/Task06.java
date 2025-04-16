package example.practica;

import java.util.Optional;
import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика 6
 * FIXME с помошью stream APi выведи имя самого старого студента
 */
public class Task06 {
	
	public static void main(String[] args) {

				StudentData.getPersons()
				.max((s1,s2)-> s1.getAge()- s2.getAge())
				.map(Student::getName).
						ifPresent(System.out::println);

	}
}