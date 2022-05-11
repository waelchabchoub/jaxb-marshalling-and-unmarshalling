/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jaxb;

import entities.Employee;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.*;
import java.io.File;

/**
 *
 * @author user
 */
public class EmployeeJaxb {
    public void Marshal(){
        try {
            Employee employee = new Employee(10,"wael",150);
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.encoding", "UTF-8");
            marshaller.setProperty("jaxb.formatted.output", true);
            marshaller.marshal(employee, new File("src\\main\\java\\Output\\employee.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(EmployeeJaxb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Unmarshal() {
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Employee employee = (Employee) unmarshaller.unmarshal(new File("src\\main\\java\\Output\\employee.xml"));
            System.out.println("Employee Id : " + employee.getId());
            System.out.println("Name : " + employee.getName());
            System.out.println("Salary : " + employee.getSalary());
        } catch (JAXBException ex) {
            Logger.getLogger(EmployeeJaxb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
