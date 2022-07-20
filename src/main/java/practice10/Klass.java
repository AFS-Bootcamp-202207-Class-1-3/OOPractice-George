package practice10;

////import practice10.pattern.Event;
//import practice10.pattern.ObserverPattern;

import java.util.Observable;

public class Klass extends Observable {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != getNumber()) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            student.setIsLeader(true);
        }
        setChanged();
        notifyObservers(student);
    }

    public void appendMember(Student student) {
        student.setKlass(new Klass(number));
        setChanged();
        notifyObservers(student);
    }

}