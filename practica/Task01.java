package example.practica;

import java.util.stream.Stream;

import example.model.SexType;
import example.model.Student;
import example.model.StudentData;

import static example.model.SexType.MALE;

/**
 * Практика 2
 * // FIXME с помошью stream APi выведи имена мужчин которые подлежат
 * // призыву в армию для несения срочной службы (от 20 до 27 лет)
 * // в алфавитном порядке
 */
public class Task01 {

    public static void main(String[] args) {

        StudentData.getPersons()
    .filter(student ->
        student.getSexType() == MALE &&
        student.getAge() >= 20 &&
        student.getAge() <= 27)
    .map(Student::getName)
    .sorted()
    .forEach(System.out::println);
    }
}
