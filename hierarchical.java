class parent{
    void display(){
        System.out.println("This is myy Father");
    }
}
class sister extends parent{
    void show(){
        System.out.println("this is my sister");
    }
}
class me extends parent{
    void display1(){
        System.out.println("This is me and iam a student");

    }
}
public class hierarchical{
    public static void main(String[] args) {
        me obj=new me();
        obj.display();
        obj.display1();

        sister sisterobj=new sister();
        sisterobj.display();
        sisterobj.show();
    }
    
}
