public class Pc {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case  theCase;
    private int pixelX;
    private int pixelY;
    private String color;
    private String program;


    public Pc(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;

    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }


    public void setPixels(int x, int y , String color){

        this.pixelX = x;
        this.pixelY = y;
        this.color = color;



    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    private void drawLogo(){

        this.monitor.drawPixel(0, 0, "white" );




    }


    public void description(){

        System.out.println("Welcome to the worst buy below is the description of the pc on sale today" + "\n" + this.theCase.toString() + "\n"
                + this.monitor.toString() + "\n" + this.motherboard.toString());

    }



        public void powerUp(){
        this.theCase.pressPowerButton();

        this.monitor.drawPixel(this.pixelX, this.pixelY, this.color);
        this.motherboard.loadProgram(this.program);



        }















}
