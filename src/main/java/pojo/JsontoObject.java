package pojo;

import com.google.gson.Gson;

public class JsontoObject {
    public static void main(String []args){
        Employe emp = new Employe();
        emp = getjsonobject();
        System.out.println(emp);
    }
    private static Employe getjsonobject()  {


        // Creating a Gson Object
        Gson gson = new Gson();
        String a = "{\"Name\":\"pravin\",\"Empid\":\"123\",\"Contact\":\"456\"},{\"Name\":\"Prem\",\"Empid\":\"567\",\"Contact\":\"789\"}";
        // Converting json to object
        // first parameter should be prpreocessed json
        // and second should be mapping class
        Employe Empl= gson.fromJson(a,Employe.class);

        // return object
        return Empl;
    }
}
