package dao.entity;

public class Customer {
    private int custid;
    private String name;
    private String email;
    private int zipcode;
    private String address;
    private String role;


    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custid=" + custid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", zipcode=" + zipcode +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
