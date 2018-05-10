
package PetCatDog;

public class Dog extends Pet {
        
    private String name;
     public Dog(String name) 
    {
    this.name=name;
        weight=17; 
        sex= "boy"; 
        age=4; 
    }
     
     public void get(){
        
        System.out.println("Собака: "+name +" Вес: "+weight +", пол: "+sex +", возраст: "+age);
     }
     
     public static void main(String[] args){ 
    Dog name = new Dog("Marcus");
    
    name.get();
    }
    
}
