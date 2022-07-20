package practice09;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private LinkedList<Klass> classes;
    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public String introduce() {
        if (classes == null || classes.size() == 0) {
            return generateTeacherIntroduceContextWithNoKlass();
        }
        return generateTeacherIntroduceContextWithKlass();
    }

    private String generateTeacherIntroduceContextWithNoKlass() {
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a Teacher. I teach No Class.",
                super.getName(), super.getAge());
    }

    private String generateTeacherIntroduceContextWithKlass() {
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a Teacher. I teach Class {2}.",
                super.getName(),
                super.getAge(), convertClassesToString(classes));
    }

    private String convertClassesToString(LinkedList<Klass> classes) {
        return classes.stream()
                .map(Klass::getNumber)
                .collect(Collectors.toList())
                .toString()
                .substring(1, classes.size() * 3 - 1);
    }


    public String introduceWith(Student student) {
        for (Klass klass : classes) {
            if (klass.getNumber() == student.getKlass().getNumber()) {
                return generateIntroduceWithStudentContext(student);
            }
        }
        return generateIntroduceWithoutStudentContext(student);
    }

    private String generateIntroduceWithStudentContext(Student student) {
        return super.introduce()
                + MessageFormat.format(" I am a Teacher. I teach {0}.", student.getName());
    }

    private String generateIntroduceWithoutStudentContext(Student student) {
        return super.introduce()
                + " I am a Teacher. I don't teach "+student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return this.classes;
    }

    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }
}
