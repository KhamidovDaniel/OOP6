package FishApeHumanAnimals;


public class animal extends fish {
    
     
     public animal () {
     name="Акула";
     }
     
     public void get(){
        System.out.println("Животное: рыба, вид "+name);
     }
     
     public static void main(String[] args){ 
    animal name = new animal();
    name.get();
    }
}