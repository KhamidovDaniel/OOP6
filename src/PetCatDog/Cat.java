package PetCatDog;

public class Cat extends Pet {
         private String name;
     public Cat(String name) 
    {
    this.name=name;
        weight=7; 
        sex="girl"; 
        age=5; 
    }
     
     public void get(){
        
        System.out.println("Кот: "+name +" Вес: "+weight +", пол: "+sex +", возраст: "+age);
     }
     
     public static void main(String[] args){ 
    Cat name = new Cat("Morris");
    
    name.get();
    }
}
