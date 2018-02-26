package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Venues extends Model {
@Id
Long id;
@Constraints.Required
String name;
@Constraints.Required
String country;
@Constraints.Required
String city;
@Constraints.Required
int capacity;

public Venues(){

}
public Venues(Long id, String name, String country, String city, int capacity){
    this.id = id;
    this.name = name;
    this.country = country;
    this.city = city;
    this.capacity = capacity;
}

public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}

public String getCountry(){
    return country;
}
public void setCountry(String country){
    this.country = country;
}

public String getCity(){
    return city;
}
public void setCity(String city){
    this.city = city;
}

public int getCapacity(){
    return capacity;
}
public void setCapacity(int capacity){
    this.capacity = capacity;
}

public static final Finder<Long, Venues> find = new Finder<>(Venues.class);


public static final List<Venues> findAll(){
    return Venues.find.all();
}

public Long getId() {
    
    return id;
    
    }
    
    public void setId(Long id) {
    
    this.id = id;
    
    }

}