import java.util.Scanner;

public class Employee {
    int Emp_id;
    String Emp_name;
    String IssueDisc;
    String type;
    Employee(int i,String n,String D,String t) {
        this.Emp_id = i;
        this.Emp_name = n;
        this.IssueDisc = D;
        this.type=t;
    }
       public void Ticket() {

           switch (type) {

               case "It Team":
                   System.out.println("Id: " + Emp_id + "\n Name: "+ Emp_name+"\nDis:" + IssueDisc);
                   System.out.println("Hello this is IT Team ");
                   Scanner sc = new Scanner(System.in);
                   String status = sc.nextLine();
                   if (status.equals("work done")) {
                       System.out.println("the issue is fixed you can check");
                   } else {
                       System.out.println("wait some time  we are trying to fix");
                   }



                   break;
               case "Hr Team":
                   System.out.println("Id: " + Emp_id + "\n Name: "+ Emp_name+"\nDis:" + IssueDisc);
                   System.out.println("Hello this is Hr Team ");
                   Scanner s = new Scanner(System.in);
                   String status2 = s.nextLine();
                   if (status2.equals("work done")) {
                       System.out.println("the issue is fixed you can check");
                   } else {
                       System.out.println("wait some time we are trying to fix");
                   }

                   break;
               case "Finance Team":
                   System.out.println("Id: " + Emp_id + "\n Name: "+ Emp_name+"\nDis:" + IssueDisc);
                   System.out.println("Hello this is Finance Team ");
                   Scanner sce = new Scanner(System.in);
                   String status3 = sce.nextLine();
                   if (status3.equals("work done")) {
                       System.out.println("the issue is fixed you can check");
                   } else {
                       System.out.println("wait some time we are trying to fix");
                   }
                   break;
               case "Facility Team":
                   System.out.println("Id: " + Emp_id + "\n Name: "+ Emp_name+"\nDis:" + IssueDisc);
                   System.out.println("Hello this is Facility Team ");
                   Scanner scb = new Scanner(System.in);
                   String status4 = scb.nextLine();
                   if (status4.equals("work done")) {
                       System.out.println("the issue is fixed you can check");
                   } else {
                       System.out.println("wait some time we are trying to fix");
                   }
                   break;
               default:
                   System.out.println("Not matched");


           }
    }

//class Demo9{
    public static void main(String[] args) {
        Employee obj1=new Employee(1,"Dhiraj","Pass","a");
        Employee obj2=new Employee(2,"Ravi","Pass","b");
        Employee obj3=new Employee(3,"Ram","Pass","c");

        obj1.Ticket();
        obj2.Ticket();
        obj3.Ticket();
//        System.out.println(obj1);




    }

}

