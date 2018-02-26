package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department{
    @Id
    int id;
    private String name;
    @OneToMany
    private ArrayList<Employee> eList;

    public Department(){
        this.id=0;
        this.name=null;
    }
    public Department(int id, String name, ArrayList<Employee> eList){
        this.id=id;
        this.name=name;
        this.eList=eList;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

}