class Employee{
    private double Salary;
    public void setSalary(double Salary){
        if(Salary>=0){
            this.Salary=Salary;
        }else{
            System.out.println("Invalid Salary");
        }
    }
    public double getSalary(){
        return Salary;
    }
}
public class validateEmployee {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setSalary(50000);
        System.out.println(e.getSalary());
        e.setSalary(-10000);
    }
}
