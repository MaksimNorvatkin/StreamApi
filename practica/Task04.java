package example.practica;

import java.util.stream.Stream;

import example.model.SexType;
import example.model.Student;
import example.model.StudentData;

/**
 * Практика 4
 * FIXME с помошью stream APi Найти кол-во потенциально работоспособных
 * 		 людей в выборке (т.е. от 18 лет и учитывая что женщины выходят на
 * 		 пенсию в 55 лет, а мужчина в 60)
 */
public class Task04 {
	
	public static void main(String[] args) {

		long countMan = StudentData.getPersons()
				.filter(student -> student.getAge() >18)
				.filter(student -> (student.getSexType() == SexType.FEMALE && student.getAge() < 60) ||
						(student.getSexType() == SexType.MALE && student.getAge() < 55))
		.count();
		System.out.println("потенциально работоспособных людей " + countMan);

	}
}