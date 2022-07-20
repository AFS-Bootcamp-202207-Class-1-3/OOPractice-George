package practice06;

import java.text.MessageFormat;

public class Student extends Person {
    private Klass klass;
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        return  generateStudentIntroduceContext();
    }

    private String generateStudentIntroduceContext() {
        return  MessageFormat.format("My name is {0}. I am {1} years old. I am a Student. I am at Class {2}.",
                super.getName(), super.getAge(), getKlass().getNumber());
    }

}
