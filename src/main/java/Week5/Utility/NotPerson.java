package Week5.Utility;

public class NotPerson
{
    private String name;
    protected String type;
    private String cnp;

    public NotPerson(final String name)
    {
        this.name = name;
        this.type = "NotPerson";
    }

    public void setCnp(final String cnp)
    {
        this.cnp = cnp;
    }

    public void print()
    {
        System.out.println(name + ", " + type);
    }
}
