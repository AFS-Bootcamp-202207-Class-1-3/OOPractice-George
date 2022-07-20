package practice05;

import java.text.MessageFormat;

public class Teacher extends Person{

    private int klass;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == 0) {
            return MessageFormat.format("My name is {0}. I am {1} years old. I am a Teacher. I teach No Class.",
                    super.getName(), super.getAge());
        }
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a Teacher. I teach Class {2}.",
                super.getName(), super.getAge(), klass);
    }
}
