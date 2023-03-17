public class PcGame extends VideoGame{
    private boolean modded;

    public PcGame(String n, String g, double p, boolean m)
    {
        super(n,g,p);
        modded = m;
    }

    public void downloadDLC()
    {
        System.out.println("All DLC has been downloaded!");
    }
}
