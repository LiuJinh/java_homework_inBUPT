package homework3;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String fName, String lName, String sNumber, double mwage, double mhours){
        super(fName,lName,sNumber);
        wage = mwage;
        hours = mhours;
    }

    @Override
    public String toString() {
        return super.toString()+"Wage:"+wage+"\n"+"Hours:"+hours+"\n";
    }

    @Override
    public double earning() {
        return wage*hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
