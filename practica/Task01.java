package example.practica;

import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика 2
 */
public class Task01 {
	
	public static void main(String[] args) {
		
		Stream<Student> stream = StudentData.getPersons();
		stream.forEach(System.out::println);
		// FIXME с помошью stream APi выведи имена мужчин которые подлежат
		// призыву в армию для несения срочной службы (от 20 до 27 лет)
		// в алфавитном порядке
	}
}