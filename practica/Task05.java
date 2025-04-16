package example.practica;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика 5
 * FIXME с помошью stream APi отсортировать студентов сначал по полу, а
 * 		потом по возрасту
 */
public class Task05 {
	
	public static void main(String[] args) {

		List<Student> sortedStudents = StudentData.getPersons()
				.sorted(Comparator.comparing(Student::getSexType)
						.thenComparingInt(Student::getAge))
				.collect(Collectors.toList());

		sortedStudents.forEach(System.out::println);
	}
}