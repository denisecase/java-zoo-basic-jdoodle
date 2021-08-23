public class ZooSimulation {
    
    static String greeting = "Welcome to Dr. Case's Zoo!";
        
    /*
    * Execution begins here
    */
    public static void main(String args[]) {

      System.out.println(greeting.toUpperCase());
      
      Aardvark alice = new Aardvark();
      alice.speak();
      alice.move();
      
    }
}
