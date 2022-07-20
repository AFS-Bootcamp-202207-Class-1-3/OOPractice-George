package practice10;

import java.text.MessageFormat;

public class Student extends Person {
    private Klass klass;
    private boolean isLeader;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public void setIsLeader(boolean isLeader) {
        this.isLeader = isLeader;
    }

    public String introduce() {
        return isLeader ? generateLeaderIntroduceContext() : generateStudentIntroduceContext();
    }

    private String generateStudentIntroduceContext() {
        return  MessageFormat.format("My name is {0}. I am {1} years old. I am a Student. I am at Class {2}.",
                super.getName(), super.getAge(), getKlass().getNumber());
    }

    private String generateLeaderIntroduceContext() {
        return  MessageFormat.format("My name is {0}. I am {1} years old. I am a Student. I am Leader of Class {2}.",
                super.getName(), super.getAge(), getKlass().getNumber());
    }

}
