package homework4;

import java.util.HashMap;
import java.util.Scanner;

public  class factory {
    private HashMap<String,Employee> employees = new HashMap<String, Employee>();

    void initEmployees(){
    	int rand;
        java.util.Random mRandom = new java.util.Random();              //获得随机数

        String id;
        String lastName;
        String firName;

        double mWage = 25;
        double mWeeklySalary = 2100;

        double mHours = 240;

        double mGross = 2000;
        double mRate = 0.2;

        double mBase = 4000;
        for(int i = 0;i<10;i++){                            //循环随机得到信息


            Scanner input = new Scanner(System.in);
            System.out.println("请输入身份证:");
            id = input.next();
            if(!id.equals("0000")){
                System.out.println("请输入姓:");
                firName = input.next();
                System.out.println("请输入名:");
                lastName = input.next();

                rand = mRandom.nextInt(4);

                switch(rand){
                    case 0 :
                        System.out.println("请输入底薪:");
                        mBase = input.nextInt();
                        System.out.println("请输入营销额:");
                        mGross = input.nextDouble();
                        System.out.println("请输入提成比例:");
                        mRate = input.nextDouble();
                        BasePlusCommisionEmployee newStu1 = new BasePlusCommisionEmployee(firName,lastName,id,mGross,mRate,mBase);
                        employees.put(id,newStu1);
                        break;

                    case 1:
                        System.out.println("请输入营销额:");
                        mGross = input.nextDouble();
                        System.out.println("请输入提成比例:");
                        mRate = input.nextDouble();
                        CommisionEmployee newStu2 = new CommisionEmployee(firName,lastName,id,mGross,mRate);
                        employees.put(id,newStu2);
                        break;

                    case 2:
                        System.out.println("请输入时薪:");
                        mWage = input.nextDouble();
                        System.out.println("请输入工作时长:");
                        mHours = input.nextDouble();
                        HourlyEmployee newStu3 = new HourlyEmployee(firName,lastName,id,mWage,mHours);
                        employees.put(id,newStu3);
                        break;

                    case 3:
                        System.out.println("请输入周薪:");
                        mWeeklySalary = input.nextDouble();
                        SalaridEmployee newStu4 = new SalaridEmployee(firName,lastName,id,mWeeklySalary);
                        employees.put(id,newStu4);
                        break;

                }
                
                System.out.println("生成成功！");
            }
            else
                break;
        }
    }

    Employee getEmployee(String empSecNumber){
        for(String key:employees.keySet())
            if(key.equals(empSecNumber))
                return employees.get(empSecNumber);
        return null;
    }

    Employee deleteEmployee(String empSecNumber){
        for(String key:employees.keySet())
            if(key.equals(empSecNumber)){
                Employee temp = employees.get(empSecNumber);
                employees.remove(empSecNumber);
                return temp;
            }
        return null;
    }

    Employee addEmployee(Employee stu){
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

    Employee updateEmployee(String empSecNumber,Employee emp){
        for(String key:employees.keySet()){
            if(key.equals(empSecNumber)){
                employees.remove(key);
                employees.put(key,emp);
                return emp;
            }
        }
        return null;
    }

    void printEmployees(){
        for(String key:employees.keySet()){
            System.out.println(employees.get(key).toString()+"earning:"+employees.get(key).earning()+"\n\n");
        }
    }
}
