/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jaxb;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] args) {
        EmployeeJaxb employeejaxb = new EmployeeJaxb();
        //employeejaxb.Marshal();
        employeejaxb.Unmarshal();
    }
}
