package homework3;

import java.util.HashMap;
import java.util.Scanner;

public  class factory {
    private HashMap<String,Employee> employees = new HashMap<String, Employee>();

    void initEmployees(){
        int rand;
        java.util.Random mRandom = new java.util.Random();              //鑾峰緱闅忔満鏁�

        String id;
        String lastName;
        String firName;

        double mWage = 25;
        double mWeeklySalary = 2100;

        double mHours = 240;

        double mGross = 2000;
        double mRate = 0.2;

        double mBase = 4000;
        for(int i = 0;i<10;i++){                            //寰幆闅忔満寰楀埌淇℃伅


            Scanner input = new Scanner(System.in);
            System.out.println("璇疯緭鍏ヨ韩浠借瘉:");
            id = input.next();
            if(!id.equals("0000")){
                System.out.println("璇疯緭鍏ュ:");
                firName = input.next();
                System.out.println("璇疯緭鍏ュ悕:");
                lastName = input.next();

                rand = mRandom.nextInt(4);

                switch(rand){
                    case 0 :
                        System.out.println("璇疯緭鍏ュ簳钖�:");
                        mBase = input.nextInt();
                        System.out.println("璇疯緭鍏ヨ惀閿�棰�:");
                        mGross = input.nextDouble();
                        System.out.println("璇疯緭鍏ユ彁鎴愭瘮渚�:");
                        mRate = input.nextDouble();
                        BasePlusCommisionEmployee newStu1 = new BasePlusCommisionEmployee(firName,lastName,id,mGross,mRate,mBase);
                        employees.put(id,newStu1);
                        break;

                    case 1:
                        System.out.println("璇疯緭鍏ヨ惀閿�棰�:");
                        mGross = input.nextDouble();
                        System.out.println("璇疯緭鍏ユ彁鎴愭瘮渚�:");
                        mRate = input.nextDouble();
                        CommisionEmployee newStu2 = new CommisionEmployee(firName,lastName,id,mGross,mRate);
                        employees.put(id,newStu2);
                        break;

                    case 2:
                        System.out.println("璇疯緭鍏ユ椂钖�:");
                        mWage = input.nextDouble();
                        System.out.println("璇疯緭鍏ュ伐浣滄椂闀�:");
                        mHours = input.nextDouble();
                        HourlyEmployee newStu3 = new HourlyEmployee(firName,lastName,id,mWage,mHours);
                        employees.put(id,newStu3);
                        break;

                    case 3:
                        System.out.println("璇疯緭鍏ュ懆钖�:");
                        mWeeklySalary = input.nextDouble();
                        SalaridEmployee newStu4 = new SalaridEmployee(firName,lastName,id,mWeeklySalary);
                        employees.put(id,newStu4);
                        break;

                }
            }
            else
                break;
        }
    }

    public Employee getEmployee(String empSecNumber){
        for(String key:employees.keySet())
            if(key.equals(empSecNumber))
                return employees.get(empSecNumber);
        return null;
    }

    public Employee deleteEmployee(String empSecNumber){
        for(String key:employees.keySet())
            if(key.equals(empSecNumber)){
                Employee temp = employees.get(empSecNumber);
                employees.remove(empSecNumber);
                return temp;
            }
        return null;
    }

    public Employee addEmployee(Employee stu){
        String id = stu.getSocialSecurityNumber();
        boolean isFind = false;
        for(String key:employees.keySet()){
            if(id.equals(key)){
                isFind = true;
                return null;
            }
        }
        if(!isFind){
            employees.put(id,stu);
            return stu;
        }
        return null;
    }

    public Employee updateEmployee(String empSecNumber,Employee emp){
        for(String key:employees.keySet()){
            if(key.equals(empSecNumber)){
                employees.remove(key);
                employees.put(key,emp);
                return emp;
            }
        }
        return null;
    }

    public void printEmployees(){
        for(String key:employees.keySet()){
            System.out.println(employees.get(key).toString()+"earning:"+employees.get(key).earning()+"\n\n");
        }
    }
    
    public double averageSalary(){
    	double temp = 0;
    	for(String key:employees.keySet()){
    		temp += employees.get(key).earning();
    	}
    	
    	if(employees.size() == 0)
    		return 0;
    	else
    		return temp/employees.size();
    }
}
