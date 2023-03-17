public class Cat extends Animal
{
    private boolean hasPlayedWith;
    private boolean scratches;

    public Cat(String n, int a, boolean v, boolean c, boolean w, boolean s)
    {
        super(n,a,v,c);
        hasPlayedWith = w;
        scratches = s;
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean isScratches() {
        return scratches;
    }

    public void play()
    {
        System.out.println(super.getName() + " has been played with!");
        hasPlayedWith = true;
    }

    public void pet()
    {
        if(scratches)
        {
            System.out.println(super.getName() + " has opted for violence!");
        }
        else
        {
            System.out.println(super.getName() + " has accepted the pet!");

        }
    }
}
