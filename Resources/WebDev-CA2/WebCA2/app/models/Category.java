package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Category extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @OneToMany
    private List<Events> events;

    public Category(){

    }

    public Category(Long id, String name, List<Events> events){
        this.id = id;
        this.name = name;
        this.events = events;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Events> getEvents(){
        return events;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEvents(List<Events> events){
        this.events = events;
    }

    public static Finder<Long, Category> find = new Finder<Long, Category>(Category.class);
    public static List<Category> findAll(){
        return Category.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String, String> options(){
        LinkedHashMap<String, String>options = new LinkedHashMap<>();

        for(Category c : Category.findAll()){
            options.put(c.getId().toString(), c.getName());
        }
        return options;
    }
}