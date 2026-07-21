import java.util.*;

public class findNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        int[]mark={70,90,45,78,30,40};
        for(int i=0;i<mark.length;i++){
        
            if(mark[i]==num){
                System.out.print("Number Found");
            return;
            }
        }
        
        System.out.print("Number not Found");
    }
}
