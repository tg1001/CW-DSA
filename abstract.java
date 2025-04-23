// Abst class in java dated 23 april 2025

abstract class sweetshop {
  // Abstract method (does not have a body)
  public abstract void frosting();
  
  public void chocolatefrosting() {
    System.out.println("add chocolate, sugar, flour, and butter");
  }
}
class cake extends sweetshop {
  public void frosting() {
    
    System.out.println("add butter, sugar, melted chocolate, and vanilla extract. WHIP it");
  }
}

class Main {
  public static void main(String[] args) {
    // create a cake object
    cake mycake = new cake(); 
    mycake.frosting();
    mycake.chocolatefrosting();
  }
}
