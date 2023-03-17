public class ConsoleGame extends VideoGame{
    private String consoleType;

    public ConsoleGame(String n, String g, double p, String t)
    {
        super(n,g,p);
        consoleType = t;
    }

    public void cleanDisk()
    {
        System.out.println("Disk has been cleaned");
    }
}
