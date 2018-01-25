package homework3;

public class SalaridEmployee extends Employee {

    private double weeklySalary;

    public SalaridEmployee(String fName, String lName, String sNumber, double mweeklySalary){
        super(fName,lName,sNumber);
        weeklySalary = mweeklySalary;
    }

    @Override
    public String toString() {
        return super.toString()+"WeeklySalary:"+weeklySalary+"\n";
    }

    @Override
    public double earning() {
        return weeklySalary*4;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
