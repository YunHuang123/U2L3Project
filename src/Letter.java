public class Letter
{
    private String fromName;
    private String toName;


    public Letter(String from)
    {
        fromName = from;
    }


    public void writeLetter(String to)
    {
        toName = to;
        greeting();
        System.out.println(to);
        specialMessage();
        closing();
    }

    public void greeting()
    {
        System.out.print("Hello, ");
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.println("From, " + fromName);
    }
}
