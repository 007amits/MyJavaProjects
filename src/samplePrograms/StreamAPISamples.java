package samplePrograms;

import java.util.ArrayList;
import java.util.List;

public class StreamAPISamples {

  public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();
    Employee e1 = new Employee();
    e1.setEmpId(1);
    e1.setEmpName("Amit");
    e1.setDepartment("IT");
    e1.setSalary(100.0);
    Employee e2 = new Employee();
    e2.setEmpId(2);
    e2.setEmpName("Ashish");
    e2.setDepartment("CS");
    e2.setSalary(200.0);
    Employee e3 = new Employee();
    e3.setEmpId(3);
    e3.setEmpName("Alok");
    e3.setDepartment("EC");
    e3.setSalary(300.0);
    Employee e4 = new Employee();
    e4.setEmpId(4);
    e4.setEmpName("Ankit");
    e4.setDepartment("EN");
    e4.setSalary(400.0);
    list.add(e1);
    list.add(e2);
    list.add(e3);
    list.add(e4);
    
    double totalSalary = list.stream().mapToDouble(i -> i.getSalary()).sum();
    System.out.println("Total Salary = "+totalSalary);
    
    list.stream().filter(i -> i.getDepartment().equals("EC")).forEach(i -> {
      System.out.println("EC Employees = "+i.getEmpName());
    });
    
    list.stream().filter(i -> i.getDepartment().equals("EN")).map(i -> i.getEmpName()).forEach(i -> {
      System.out.println("Employee in EN = "+i);
    });
    

  }

}
