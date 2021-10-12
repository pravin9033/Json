package pojo;

public class Employe {
    private String Name;
    private String EmpId;
    private String Contact;

    public String getName() {
        return Name;
    }

    public String getEmpId() {
        return EmpId;
    }

    public String getContact() {
        return Contact;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
    @Override
    public String toString()
    {
        return "Employee [Name="+ Name + ", EmpId="+ EmpId+ ", Contact="+ Contact + "]";

    }
}

