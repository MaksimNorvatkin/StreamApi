package example.practica;

import java.util.stream.Stream;

import example.model.Student;
import example.model.StudentData;

/**
 * Практика 1
 * // FIXME используя методы стрима выведи только имена студентов группы java1
 */
public class Task00 {

    public static void main(String[] args) {

        Stream<Student> stream = StudentData.getPersons();

        stream.filter(student -> "java1".equals(student.getGroup().getName()))
                .map(Student::getName)
                .forEach(System.out::println);
    }
}