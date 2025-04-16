package example.practica;

import java.util.OptionalDouble;
import java.util.stream.Stream;

import example.model.SexType;
import example.model.Student;
import example.model.StudentData;

/**
 * Практика 3
 * // FIXME с помошью stream APi найди средний возраст всех мужчин группы java 2
 */
public class Task03 {
	
	public static void main(String[] args) {

		OptionalDouble stream = StudentData.getPersons()
		.filter(student -> "java2".equals(student.getGroup().getName()))
				.filter(s->s.getSexType() == SexType.MALE)
				.mapToInt(Student::getAge)
				.average();
		System.out.println("средний возраст всех мужчин группы java 2"+ stream.getAsDouble());
	}
}