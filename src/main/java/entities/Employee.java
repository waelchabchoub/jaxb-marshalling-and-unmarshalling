/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

/**
 *
 * @author user
 */
@XmlRootElement
public class Employee implements Serializable{
    
    private int id;
    private String name;
    private double salary;
    
    

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }
     
    
    @XmlAttribute
    public int getId() {
        return id;
    }
    @XmlElement(name="name")
    public String getName() {
        return name;
    }
    
    @XmlElement(name="salary")
    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
