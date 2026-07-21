public class markList {
    public static void main(String[] args) {
        int[] mark={10,20,30,40,50,60};
        String[] subject={"Tamil","English","Maths","Science","Social"};
        for (int i= 0; i < mark.length; i++) {
            System.out.println(subject[i]+ "="+mark[i]);
        }
    }
    
}
