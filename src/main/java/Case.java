public class Case {
   private String model;
   private String manufacturer;
   private String powerSupply;
   private Dimension dimensions;


   public Case(String model, String manufacturer, String powerSupply, Dimension dimensions){
      this.model = model;
      this.manufacturer = manufacturer;
      this.powerSupply = powerSupply;
      this.dimensions = dimensions;


   }

      public void pressPowerButton(){

         System.out.println("Power Button Pressed");

      }

   @Override
   public String toString() {
      return "Case{" +
              "model='" + this.model + '\'' +
              ", manufacturer='" + this.manufacturer + '\'' +
              ", powerSupply='" + this.powerSupply + '\'' +
              ", dimensions=" + this.dimensions +
              '}';
   }
}
