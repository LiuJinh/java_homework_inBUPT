package homework3;


import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
    	
            Employee[] allEmployees = new Employee[10];

            int rand;
            java.util.Random mRandom = new java.util.Random();              //获得随机数


            //基本信息
            String firName = "yang";
            String lastName ;

            double mWage = 25;
            double mWeeklySalary = 2100;

            double mHours = 240;

            double mGross = 2000;
            double mRate = 0.2;

            double mBase = 4000;

            int id;
            for(int i = 0;i<10;i++){                            //循环随机得到信息
                id = 20171219;
                lastName = "yahao"+String.valueOf(i);
                id += i;
                rand = mRandom.nextInt(4);

                switch(rand){
                    case 0 :allEmployees[i] = new BasePlusCommisionEmployee(firName,lastName,String.valueOf(id),mGross,mRate,mBase);
                    mBase += rand*10;
                    break;

                    case 1:allEmployees[i] = new CommisionEmployee(firName,lastName,String.valueOf(id),mGross,mRate);
                    mGross += rand*10;
                    mRate += 0.01 * rand;
                    break;

                    case 2:allEmployees[i] = new HourlyEmployee(firName,lastName,String.valueOf(id),mWage,mHours);
                    mWage+=rand;
                    mHours+=rand* 0.1;
                    break;

                    case 3:allEmployees[i] = new SalaridEmployee(firName,lastName,String.valueOf(i),mWeeklySalary);
                    mWeeklySalary+=10*rand;
                    break;

                }
            }


            for(int i = 0;i<10;i++){                        //输出所有
                System.out.println(allEmployees[i].toString()+"earning:"+allEmployees[i].earning()+"\n\n");
            }
        }
    
}