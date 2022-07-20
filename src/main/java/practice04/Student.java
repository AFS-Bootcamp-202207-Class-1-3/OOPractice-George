package practice04;

import java.text.MessageFormat;

public class Student extends Person {
    private int klass;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        return  MessageFormat.format("My name is {0}. I am {1} years old. I am a Student. I am at Class 2.",
                super.getName(), super.getAge());
    }

}
