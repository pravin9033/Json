package Company;



public class Employee {
    private String Name;
    private String Empid;
    private String Contact;


    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return Name;
    }


    public void setId(String Empid) {
        this.Empid = Empid;
    }
    public String getId() {
        return Empid;
    }


    public void setContact(String Contact){
        this.Contact = Contact;
    }
    public String getContact() {
        return Contact;
    }

    void getData(){
        System.out.println(getName());
        System.out.println(getId());
        System.out.println(getContact());
    }
}









