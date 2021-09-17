public class Tabajaras {
    private String name, department;
    private double salary;
    private int yearIn, RG, subordinates;
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

    public void salaryValue() {
        double salary;
        salary =  (getSubordinates()*20.00) + getSalary();
        
        if(salary >= 1000.00){
            salary = salary - (getSalary()*0.3);
            setSalary(salary);
        }
        else if(salary < 1000.00){
            salary = salary - (getSalary()*0.5);
            setSalary(salary);
        }
    }

    public void printData() {
        System.out.println("\nName: " + getName() +
                           "\nDepartment: " + getDepartment() + 
                           "\nSalary: " + getSalary() + 
                           "\nSince: " + getYearIn() +
                           "\nRG: " + getRG() + 
                           "\nSubordinates: " + getSubordinates() +
                           "\nIs Working: " + getIsWorking());
    }
}
