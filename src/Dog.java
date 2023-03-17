public class Dog extends Animal
{
    private boolean hasBeenWalked;
    private String favoriteToy;

    public Dog(String n, int a, boolean v, boolean c, boolean w, String favToy)
    {
        super(n,a,v,c);
        hasBeenWalked = w;
        favoriteToy = favToy;
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void walk()
    {
        System.out.println(super.getName() + " has been walked!");
        hasBeenWalked = true;
    }

    public void giveToy(String toy)
    {
        int i = (int) Math.random() * 10;
        if (i < 5)
        {
            System.out.println(toy + " in now " + super.getName() +"'s favorite toy!");
            favoriteToy = toy;
        }
        else
        {
            System.out.println(favoriteToy + " is still " +  super.getName() + "'s favorite toy!");
        }
    }
}
