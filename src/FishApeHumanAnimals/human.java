package FishApeHumanAnimals;


public class human extends ape {
    public human () {
     name="горилла";
     }
    
      public void get(){
        System.out.println("Человек произошел от обезьяны вида:"+name);
     }
      
      public static void main(String[] args){ 
    human name = new human();
    name.get();
    }
}
