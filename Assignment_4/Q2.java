class Employee{
    String name;
    int yearOfJoining;
    int salary;
    String address;

    Employee(String name, int yearOfJoining, int salary, String address){
        this.name=name;
        this.yearOfJoining=yearOfJoining;
        this.salary=salary;
        this.address=address;
    }

    void printInformation(){
        System.out.println(this.name+"      "+this.yearOfJoining+"      "+this.salary+"     "+this.address);
    }
}

public class Q2 {
    public static void main(String[] args) {
        //Creating 3 employee objects of class Employee
        Employee e1 = new Employee("Robert", 1994, 20000, "64C-Wallstreet");
        Employee e2 = new Employee("Sam", 2000, 15000, "68D-Wallstreet");
        Employee e3 = new Employee("John", 1999, 40000, "26B-Wallstreet");

        //Generating desired output
        System.out.println("Name    Year of Joining     Salary      Address");
        e1.printInformation();
        e2.printInformation();
        e3.printInformation();
        


        
    }
    
}
