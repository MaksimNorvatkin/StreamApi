package example.practica;

import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика 4
 */
public class Task04 {
	
	public static void main(String[] args) {
		
		Stream<Student> stream = StudentData.getPersons();
		stream.forEach(System.out::println);
		// FIXME с помошью stream APi Найти кол-во потенциально работоспособных
		// людей в выборке (т.е. от 18 лет и учитывая что женщины выходят на
		// пенсию в 55 лет, а мужчина в 60)

	}
}