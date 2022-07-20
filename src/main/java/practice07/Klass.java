package practice07;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class 2";
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
