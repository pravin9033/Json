package pojo;

import com.google.gson.Gson;

public class JsontoObject {
    public static void main(String []args){
        Employe emp = new Employe();
        emp = getjsonobject();
        System.out.println(emp);
    }
    private static Employe getjsonobject()  {
        String a;
        a = "[{\"Name\":\"Pravin\",\"Empid\":\"123\",\"Contact\":\"123\"},{\"Name\":\"Prem\",\"Empid\":\"124\",\"Contact\":\"124\"}]";
        // Creating a Gson Object
        Gson gson = new Gson();

        // Converting json to object
        // first parameter should be prpreocessed json
        // and second should be mapping class
        Employe Empl= gson.fromJson(a,Employe.class);

        // return object
        return Empl;
    }
}
