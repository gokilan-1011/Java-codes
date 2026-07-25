class student{
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class idName {
    public static void main(String[] args) {
        student s=new student();
        s.setId(101);
        s.setName("Gokilan");
        System.out.println("ID:"+s.getId());
        System.out.println("NAME:"+s.getName());
    }
    
}
