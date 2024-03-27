package Week5.Utility;

import Week5.Utility.Person;

public class Hired extends Person
{
    public Hired(final String name, final String cnp, final int age)
    {
        super(name, cnp, age);
        type = "Hired";
    }
}
