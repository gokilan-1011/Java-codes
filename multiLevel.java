class grandpa{
    void display(){
        System.out.println("My grand father is farmer");
    }
}
class father extends grandpa{
    void show(){
        System.out.println("My father is the future grandpa");
    }
}
class me extends father{
    void diplay1(){
        System.out.println("I am the future father");
    }
}

public class multiLevel {
    public static void main(String[] args) {
        me obj=new me();
        obj.display();
        obj.show();
        obj.diplay1();
    }
    
}
