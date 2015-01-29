/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author nagnello
 */
public class Employer {
    private Employee employee;
    
    
    public void hireEmployee(String firstName, String lasName, String ssn){
        employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lasName);
        employee.setSsn(ssn);
        
    }
    
    public void employeeOrientation(){
        employee.beginEmployment();
        employee.getStatus();
    }
    
    public void assignCubicle(){
        employee.setCubeId("A");
        employee.getStatus();
    }
    
}
