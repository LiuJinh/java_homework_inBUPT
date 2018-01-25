package homework3;

import java.util.HashMap;
import java.util.Scanner;

public class CommisionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommisionEmployee(String fName, String lName, String sNumber, double gSale, double cRate){
        super(fName,lName,sNumber);
        grossSales = gSale;
        commissionRate = cRate;
    }

    @Override
    public String toString() {
        return super.toString()+"GrossSales:"+grossSales+"\n"+"CommissionRate"+commissionRate+"\n";
    }

    @Override
    public double earning() {
        return grossSales*commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


}
