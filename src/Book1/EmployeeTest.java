package Book1;

import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff= new Employee[4];

        staff[0]= new Employee("Jon SNow",90000,1975,12,16);
        staff[1]= new Employee("Arya Sterk",95000,1979,11,17);
        staff[2]= new Employee("Jim Helpart",80000,1978,10,11);
        staff[3]= new Employee("Michael Scott",110000,1970,8,1);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());

    }
}
class Employee{
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    private String name;
    private double salary;
    private Date hireDay;
}
