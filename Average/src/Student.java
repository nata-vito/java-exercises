import java.util.*;

public class Student {
    private String name;
    private int ra;
    private double notes[] = new double[5]; 

    public Student(String name, int ra){
        this.name = name;
        this.ra = ra;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }
    
    public double[] getNotes() {
        return notes;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    
    public double[] noteInput() {
        double[] notes = new double[5];

        for(int a = 0; a < 5; a++){
            Scanner in = new Scanner(System.in);
            System.out.printf("Nota %d: ", a+1);
            notes[a] = in.nextDouble();
        }

        return notes;
    }
}
