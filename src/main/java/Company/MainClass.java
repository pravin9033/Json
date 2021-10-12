package Company;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String [] args){
        //First Object
        Employee emp1 = new Employee();
        Scanner x = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = x.nextLine();
        emp1.setName(name);

        System.out.println("Enter Employee Id: ");
        String EmpId = x.nextLine();
        emp1.setId(EmpId);

        System.out.println("Enter Contact Number: ");
        String Contact = x.nextLine();
        emp1.setContact(Contact);

        //Second Object

        Employee emp2 = new Employee();

        System.out.println("Enter name: ");
        String ame = x.nextLine();
        emp2.setName(ame);

        System.out.println("Enter Employee Id: ");
        String EmpI = x.nextLine();
        emp2.setId(EmpI);

        System.out.println("Enter Contact Number: ");
        String Contac = x.nextLine();
        emp2.setContact(Contac);

        //Creating ArrayList
        ArrayList<Object> emplist = new ArrayList<Object>();
        emplist.add(emp1);
        emplist.add(emp2);

        //Converting Into Json
        Gson gson = new Gson();
        String json = gson.toJson(emplist);
        System.out.println("{Employees :"+json+"}");





    }


    }
