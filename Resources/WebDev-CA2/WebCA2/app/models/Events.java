package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Events extends Model {
@Id
Long id;
@Constraints.Required
String name;
@Constraints.Required
String venue;
@Constraints.Required
String date;
@Constraints.Required
double price;

@ManyToOne
private Category category;

public Events(){

}
public Events(Long id, String name, String venue, String date, double price){
    this.id = id;
    this.name = name;
    this.venue = venue;
    this.date = date;
    this.price = price;
}

public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}

public String getVenue(){
    return venue;
}
public void setVenue(String venue){
    this.venue = venue;
}

public String getDate(){
    return date;
}
public void setDate(String date){
    this.date = date;
}

public double getPrice(){
    return price;
}
public void setPrice(double price){
    this.price = price;
}

public static final Finder<Long, Events> find = new Finder<>(Events.class);


public static final List<Events> findAll(){
    return Events.find.all();
}

public Category getCategory(){
    return category;
}
public void setCategory(Category category){
    this.category = category;
}

public Long getId() {
    
    return id;
    
    }
    
    public void setId(Long id) {
    
    this.id = id;
    
    }

}