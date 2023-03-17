public class Runner {
    public static void main(String[] args) {
        Animal a = new Animal("Thing", 999, true, false);
        a.getName();
        a.getAge();
        a.isVaccinated();
        a.isHasBeenCleaned();
        a.adopt();
        a.feed();
        a.clean();

        Dog dawg = new Dog("Buffy", 999, true, false, false, "Bone");
        dawg.getName();
        dawg.getAge();
        dawg.isVaccinated();
        dawg.isHasBeenCleaned();
        dawg.adopt();
        dawg.feed();
        dawg.clean();
        dawg.isHasBeenWalked();
        dawg.walk();
        dawg.isHasBeenWalked();
        dawg.getFavoriteToy();
        dawg.giveToy("Rope");

        Cat gato = new Cat("Maxwell", 999, true, false, false, true);
        gato.getName();
        gato.getAge();
        gato.isVaccinated();
        gato.isHasBeenCleaned();
        gato.adopt();
        gato.feed();
        gato.clean();
        gato.isScratches();
        gato.play();
        gato.isHasPlayedWith();
        gato.pet();

        Cat niceGato = new Cat("Cha", 999, true, false, false, false);
        niceGato.pet();
    }
}
