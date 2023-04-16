public class Main {


    public static void main(String[] args) {
        Resolution resolution = new Resolution(50, 50);
        Monitor monitor = new Monitor(resolution, "HP24m", "HP" );
        Dimension dimen = new Dimension(200, 200, 100);
        Case thecase = new Case("Windows xp", "Sony", "220 volts", dimen);
        Motherboard mother = new Motherboard("Sony 23","Sony", 2, 4, "Sony-bios" );
        Pc system1 = new Pc(mother, monitor, thecase);
        system1.setProgram("Photoshop");
        system1.setPixels(10, 10, "purple");

        system1.description();

        System.out.println();

        system1.powerUp();




    }
}
