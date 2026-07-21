public class studentMark {
    public static void main(String[] args) {
        String[] name={"Karthik","Deepak","Goks","Askar"};
        int[][] mark={{50,90,70,60,80},{80,60,40,80,70},{98,58,48,59,74},{59,86,79,47,58}};
        for(int i=0;i<name.length;i++){
            System.out.println("Name =" +name[i]);
            double total=0;
            for(int j=0;j<mark[i].length;j++){
                System.out.println(mark[i][j]+" ");
                total+=mark[i][j];
            }
            System.out.println();
            System.out.println("Average:" +(total/5)+ "%");
            System.out.println();
        }

    }
}
