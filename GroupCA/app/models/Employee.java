package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;



@Entity
public class Employee extends Model{

    @Id
    int id;
    private String fname;
    private String lname;
    @OneToOne
    private Address address;
    @ManyToOne
    private Department department;
    @ManyToMany
    private ArrayList<Project> pList;

    public Employee(Long id, String fname, String lname, Address address, Department department){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.department = department;
    }

    public Long getId(){
        return this.id;
    }
    public String getFname(){
        return this.fname;
    }
    public String getLname(){
        return this.lname;
    }
    public Address getAddress(){
        return this.address;
    }
    public Department getDepartment(){
        return this.department;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setFname(String fname){
        this.department= department;
    }
    public void setLname(String lname){
        this.lname=lname;
    }
    public void setAddress(Address address){
        this.address=address;
    }
    public void setDepartment(Department department){
        this.department=department;
    }


}