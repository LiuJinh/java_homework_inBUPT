package homework5;

public class BasePlusCommisionEmployee extends CommisionEmployee {

    private double baseSalary;


    public BasePlusCommisionEmployee(String fName, String lName, String sNumber, double gSale, double cRate, double bSalary) {
        super(fName,lName,sNumber,gSale,cRate);
        baseSalary = bSalary;
    }

    @Override
    public String toString() {
        return super.toString()+"BaseSalary"+baseSalary+"\n";
    }

    @Override
    public double earning() {
        return super.earning()+baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
