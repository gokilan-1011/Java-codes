class student{
    int rollno;
    String name;
    String dept;
    String section;
    int year;

    student(int rollno, String name, String dept, String section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("Rollno:" +rollno);
        System.out.println("Name:" +name);
        System.out.println("Department:" +dept);
        System.out.println("Section:" +section);
        System.out.println("year:" +year);
    }
}

public class details {
    public static void main(String[] args) {
        student[]student = new student[3];
        student s1=new student(101,"AKASH","ECE","A",2005);
        student[0]=s1;
        student s2=new student(102,"PERAM","ECE","A",2005);
        student[1]=s2;
        student s3=new student(103,"JOE","ECE","A",2005);
        student[2]=s3;
        for(int i=0;i<student.length;i++){
            student[i].display();
        }
        System.out.println();

    }
    
}
