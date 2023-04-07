public class Pc {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case  aCase;


    public Pc(Motherboard motherboard, Monitor monitor, Case aCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.aCase = aCase;

    }


    private void drawLogo(){



    }


    public void description(){

        System.out.println("Welcome to the worst buy below is the description of the pc on sale today" + "\n" + this.aCase
                + this.monitor + this.motherboard);

    }
















}
