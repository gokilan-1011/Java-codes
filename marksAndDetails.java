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
    } 
class mark{
    int tamil;
    int english;
    int maths;
    int science;
    int social;
    mark(int tamil, int english, int maths,int science, int social){
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;
    }
    int total(){
        return tamil+english+maths+science+social;
    }
    double average(){
        return total ()/5.0;
    }
    }
public class detailsAndMark {
    public static void main(String[] args) {
        student[]student = new student[3];
        mark[]mark=new mark[3];
        student s1=new student(101,"AKASH","ECE","A",2005);
        mark m1=new mark(85,78,96,78,47);
        student[0]=s1;
        mark[0]=m1;
        student s2=new student(102,"PERAM","ECE","A",2005);
        mark m2=new mark(89,78,56,48,47);
        student[1]=s2;
        mark[1]=m2;
        student s3=new student(103,"JOE","ECE","A",2005);
        mark m3=new mark(96,75,83,68,79);
        student[2]=s3;
        mark[2]=m3;
        for(int i=0;i<student.length;i++){
            
        System.out.println("Rollno:" +student[i].rollno);
        System.out.println("Name:" +student[i].name);
        System.out.println("Department:" +student[i].dept);
        System.out.println("Section:" +student[i].section);
        System.out.println("year:" +student[i].year);

        
        System.out.println("Tamil:" +mark[i].tamil);
        System.out.println("English:" +mark[i].english);
        System.out.println("Maths:" +mark[i].maths);
        System.out.println("Science:" +mark[i].science);
        System.out.println("Social:" +mark[i].social);

        System.out.println("Total:"+mark[i].total());
        System.out.println("Average:"+mark[i].average());
            }
        }
        
    }

