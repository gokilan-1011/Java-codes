class Animal{
    void sound(){
        System.out.println("Animal makes the sound");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("cat meow");
    }
}

public class forest {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
        a=new cat();
        a.sound();
    }
    
}
