package SW_Package_4;

public class Student
{int rollNo; // int variable
 int age; // int variable 
 public void display1() //method display1
 {System.out.println("Welcome to all of you");
 }
 public void display2()//Method display 2
 {System.out.println("Automation is very easy");
 }
public static void main(String[] args) //Main method
{Student Stu = new Student();// Class object Stu
Stu.rollNo=1;
Stu.age=15;
System.out.println("Roll Number: "+Stu.rollNo);
System.out.println("Age: "+Stu.age);
Stu.display1();
Stu.display2();
Student Hari = new Student(); // Class object Hari 
Hari.rollNo=5;
Hari.age=31;
System.out.println("Roll Number: "+Hari.rollNo);
System.out.println("Age: "+Hari.age);
Hari.display1();
Hari.display2();
}
}
