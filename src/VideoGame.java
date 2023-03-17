public class VideoGame
{
    private String name;
    private String genre;
    private double price;

    public VideoGame(String n, String g, double p)
    {
        name = n;
        genre = g;
        price = p;
    }

    public void purchase()
    {
        System.out.println(name +" has been purchased at a price of " + price);
    }
}
