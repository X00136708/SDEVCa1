package models;

import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Project extends Model{
    @Id
    int id;
    private Date dueDate;
    private Date startDate;
    @ManyToMany
    private ArrayList<Employee> eList;

    public Project(){
        this.id=0;
        this.dueDate=0;
        this.startDate=0;
        
    }
    public Project(int id, Date dueDate, Date startDate, ArrayList<Employee> eList){
        this.id=id;
        this.dueDate=dueDate;
        this.startDate=startDate;
        this.eList=new ArrayList();
    }
    public int getId(){
        return this.id;
    }
    public Date getdueDate(){
        return this.dueDate;
    }
    public Date getstartDate(){
        return this.startDate;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setdueDate(Date dueDate){
        this.dueDate=dueDate;
    }
    public void setstartDate(Date startDate){
        this.startDate=startDate;
    }
}