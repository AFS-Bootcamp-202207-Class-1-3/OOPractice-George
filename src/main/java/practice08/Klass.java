package practice08;

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
        if (student.getKlass().getNumber() != getNumber()) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            student.setIsLeader(true);
        }
    }

    public void appendMember(Student student) {
        student.setKlass(new Klass(number));
    }
}
