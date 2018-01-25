package homework4;


import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        boolean isOut = false;
        factory mFa = new factory();
        mFa.initEmployees();

        Scanner input = new Scanner(System.in);

        String id;
        String lastName;
        String firName;

        double mWage = 25;
        double mWeeklySalary = 2100;

        double mHours = 240;

        double mGross = 2000;
        double mRate = 0.2;

        double mBase = 4000;

        Employee temp = null;

        int choice;
        while (true) {
            if(isOut)
                break;

            isOut = false;

            System.out.println("选择:1.查看所有员工  2.更新员工  3.删除员工  4.查询员工  5.添加员工  6.退出");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("员工信息如下：\n");
                    mFa.printEmployees();
                    System.out.println("\n\n");
                    break;

                case 2:
                    temp = null;
                    System.out.println("请输入要更新的工号:");
                    id = input.next();

                    System.out.println("请输入员工类型：(0.BasePlusCommisionEmployee、1.CommisionEmployee、2.HourlyEmployee、"
                            + "3.SalaridEmployee)");
                    int rand = input.nextInt();
                    
                    while(rand>3||rand<0){
                    	System.out.println("类型输入错误！");
                    	System.out.println("请输入员工类型：(0.BasePlusCommisionEmployee、1.CommisionEmployee、2.HourlyEmployee、"
                                + "3.SalaridEmployee)");
                    	rand = input.nextInt();
                    }

                    System.out.println("请输入姓:");
                    firName = input.next();
                    System.out.println("请输入名:");
                    lastName = input.next();

                    switch (rand) {
                        case 0:
                            System.out.println("请输入底薪:");
                            mBase = input.nextInt();
                            System.out.println("请输入营销额:");
                            mGross = input.nextDouble();
                            System.out.println("请输入提成比例:");
                            mRate = input.nextDouble();
                            BasePlusCommisionEmployee newStu5 = new BasePlusCommisionEmployee(firName, lastName, id, mGross, mRate, mBase);
                            temp = mFa.updateEmployee(id, newStu5);
                            break;

                        case 1:
                            System.out.println("请输入营销额:");
                            mGross = input.nextDouble();
                            System.out.println("请输入提成比例:");
                            mRate = input.nextDouble();
                            CommisionEmployee newStu2 = new CommisionEmployee(firName, lastName, id, mGross, mRate);
                            temp = mFa.updateEmployee(id, newStu2);
                            break;

                        case 2:
                            System.out.println("请输入时薪:");
                            mWage = input.nextDouble();
                            System.out.println("请输入工作时长:");
                            mHours = input.nextDouble();
                            HourlyEmployee newStu3 = new HourlyEmployee(firName, lastName, id, mWage, mHours);
                            temp = mFa.updateEmployee(id, newStu3);
                            break;

                        case 3:
                            System.out.println("请输入周薪:");
                            mWeeklySalary = input.nextDouble();
                            SalaridEmployee newStu4 = new SalaridEmployee(firName, lastName, id, mWeeklySalary);
                            temp = mFa.updateEmployee(id, newStu4);
                            break;

                    }

                    if (temp != null) {
                        System.out.println("更新后员工信息为:\n" + temp.toString() + "earning:" + temp.earning() + "\n\n");
                    } else System.out.println("更新失败,查无此员工!");
                    break;

                case 3:
                    System.out.println("请输入要删除的工号:");
                    id = input.next();

                    temp = mFa.deleteEmployee(id);
                    if (temp != null) {
                        System.out.println("删除员工信息如下:\n" + temp.toString() + "earning:" + temp.earning() + "\n\n");
                    } else System.out.println("删除失败，该员工不存在");
                    break;

                case 4:
                    System.out.println("查找员工项目：请输入要查找的安全证号：");
                    id = input.next();
                    Employee newStu1 = mFa.getEmployee(id);
                    if (newStu1 == null)
                        System.out.println("不存在此员工");
                    else {
                        System.out.println(newStu1.toString() + "earning:" + newStu1.earning() + "\n\n");
                    }
                    break;

                case 5:
                    temp = null;

                    System.out.println("请输入要添加的工号:");
                    id = input.next();

                    System.out.println("请输入员工类型：(0.BasePlusCommisionEmployee、1.CommisionEmployee、2.HourlyEmployee、"
                            + "3.SalaridEmployee)");
                    int rand1 = input.nextInt();
                    while(rand1>3||rand1<0){
                    	System.out.println("类型输入错误！");
                    	System.out.println("请输入员工类型：(0.BasePlusCommisionEmployee、1.CommisionEmployee、2.HourlyEmployee、"
                                + "3.SalaridEmployee)");
                        rand1 = input.nextInt();
                    }

                    System.out.println("请输入姓:");
                    firName = input.next();
                    System.out.println("请输入名:");
                    lastName = input.next();

                    switch (rand1) {
                        case 0:
                            System.out.println("请输入底薪:");
                            mBase = input.nextInt();
                            System.out.println("请输入营销额:");
                            mGross = input.nextDouble();
                            System.out.println("请输入提成比例:");
                            mRate = input.nextDouble();
                            BasePlusCommisionEmployee newStu5 = new BasePlusCommisionEmployee(firName, lastName, id, mGross, mRate, mBase);
                            temp = mFa.addEmployee(newStu5);
                            break;

                        case 1:
                            System.out.println("请输入营销额:");
                            mGross = input.nextDouble();
                            System.out.println("请输入提成比例:");
                            mRate = input.nextDouble();
                            CommisionEmployee newStu2 = new CommisionEmployee(firName, lastName, id, mGross, mRate);
                            temp = mFa.addEmployee(newStu2);
                            break;

                        case 2:
                            System.out.println("请输入时薪:");
                            mWage = input.nextDouble();
                            System.out.println("请输入工作时长:");
                            mHours = input.nextDouble();
                            HourlyEmployee newStu3 = new HourlyEmployee(firName, lastName, id, mWage, mHours);
                            temp = mFa.addEmployee(newStu3);
                            break;

                        case 3:
                            System.out.println("请输入周薪:");
                            mWeeklySalary = input.nextDouble();
                            SalaridEmployee newStu4 = new SalaridEmployee(firName, lastName, id, mWeeklySalary);
                            temp = mFa.addEmployee(newStu4);
                            break;

                    }

                    if (temp != null) {
                        System.out.println("添加的员工信息为:\n" + temp.toString() + "earning:" + temp.earning() + "\n\n");
                    } else System.out.println("添加失败,已有该员工!");
                    break;


                case 6:
                    isOut = true;

                default:
                    System.out.println("请输入数字1-5！\n");
            }

        }
    }
}