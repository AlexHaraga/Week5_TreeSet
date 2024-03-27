package Week5.Utility;

import Week5.Utility.Person;

public class Unemployed extends Person
{
    public Unemployed(final String name, final String cnp, final int age)
    {
        super(name, cnp, age);
        type = "Unemployed";
    }
}
