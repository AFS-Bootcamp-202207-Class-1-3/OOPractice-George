package practice04;

import java.text.MessageFormat;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }
    public String introduce() {
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a Worker. I have a job.",
                super.getName(), super.getAge());
    }
}
