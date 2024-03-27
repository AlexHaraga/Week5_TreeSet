package Week5.Utility;

import Week5.Utility.Person;

public class Student extends Person
{
    public Student(final String name, final String cnp, final int age)
    {
        super(name, cnp, age);
        type = "Student";
    }

    public void hasExam()
    {
        System.out.println("Yes");
    }

}
