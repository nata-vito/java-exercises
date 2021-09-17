import java.util.*;

public class Tabajaras {
    private String name, department;
    private double salary;
    private int yearIn, since, RG, subordinates;
    private boolean isWorking;

    public Tabajaras(){

    }

    public Tabajaras(String name, String department, double salary, int yearIn, int RG, int subordinates, boolean isWorking){
        setName(name);
        setDepartment(department);
        setSalary(salary);
        setYearIn(yearIn);
        setRG(RG);
        setSubordinates(subordinates);
        setWorking(isWorking);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearIn() {
        return yearIn;
    }

    public void setYearIn(int yearIn) {
        this.yearIn = yearIn;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int rG) {
        RG = rG;
    }

    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }

    public boolean getIsWorking() {
        return isWorking;
    }
    
    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public void salaryValue() {
        double salary = 0;

        sinceYears();

        if(getSince() < 5){
            salary = getSalary() + (getSalary()*0.05); 
        }
        else if(getSince() > 5){
            salary = getSalary() + (getSalary()*0.08); 
        }

        setSalary(salary);

        System.out.println(getSalary());

        salary =  (getSubordinates()*20.00) + getSalary();
        setSalary(salary);
        System.out.println(getSalary());

        
        if(salary <= 1000.00){
            System.out.println("<");
            salary = salary - (getSalary()*0.03);
        }
        else if(salary > 1000.00){
            System.out.println(">");
            salary = getSalary() - (getSalary()*0.05);
        }

        setSalary(salary);
        System.out.println(getSalary());
    }

    public void sinceYears() {
        Calendar d = new GregorianCalendar();
        Date date = new Date();
        int yearActual, years;

        d.setTime(date);

        yearActual = d.get(Calendar.YEAR);
        years = yearActual - getYearIn();

        setSince(years);
        System.out.println(years);
    }

    public void printData() {

        salaryValue();

        System.out.println("\nName: " + getName() +
                           "\nDepartment: " + getDepartment() + 
                           "\nSalary: " + getSalary() + 
                           "\nYears: " + getSince() +
                           "\nRG: " + getRG() + 
                           "\nSubordinates: " + getSubordinates() +
                           "\nIs Working: " + getIsWorking());
    }
}
