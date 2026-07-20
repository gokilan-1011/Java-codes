import java.util.*;

public class findNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name:");
        String n=sc.nextLine();
        String [] name={"Aadhi","Goks","Deepak","karthi"};
        for(int i=0;i<name.length;i++){
        
            if(name[i].equals(n)){
                System.out.print("Name Found");
            return;
            }
        }
        
        System.out.print("Name not Found");
    }
}
