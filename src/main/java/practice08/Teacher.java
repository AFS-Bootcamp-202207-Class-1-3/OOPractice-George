package practice08;

import java.text.MessageFormat;

public class Teacher extends Person {

    private Klass klass;
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == null) {
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
                super.getName(), super.getAge(), klass.getNumber());
    }

    public String introduceWith(Student student) {
        return student.getKlass().getNumber() == klass.getNumber()
                ? generateIntroduceWithStudentContext(student)
                : generateIntroduceWithoutStudentContext(student);
    }

    private String generateIntroduceWithStudentContext(Student student) {
        return super.introduce()
                + MessageFormat.format(" I am a Teacher. I teach {0}.", student.getName());
    }

    private String generateIntroduceWithoutStudentContext(Student student) {
        return super.introduce()
                + " I am a Teacher. I don't teach "+student.getName() + ".";
    }
}
