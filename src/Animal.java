public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;

    private boolean hasBeenCleaned;

    public Animal(String n, int a, boolean v, boolean c)
    {
        name = n;
        age = a;
        vaccinated = v;
        hasBeenCleaned = c;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasBeenCleaned() {
        return hasBeenCleaned;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void adopt()
    {
        System.out.println(name + " has been adopted!");
    }

    public void feed()
    {
        System.out.println(name + " has been fed!");
    }

    public void clean()
    {
        System.out.println(name + " has been cleaned!");
    }
}
