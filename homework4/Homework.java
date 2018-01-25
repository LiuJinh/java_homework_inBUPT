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

            System.out.println("ѡ��:1.�鿴����Ա��  2.����Ա��  3.ɾ��Ա��  4.��ѯԱ��  5.���Ա��  6.�˳�");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("Ա����Ϣ���£�\n");
                    mFa.printEmployees();
                    System.out.println("\n\n");
                    break;

                case 2:
                    temp = null;
                    System.out.println("������Ҫ���µĹ���:");
                    id = input.next();

                    System.out.println("������Ա�����ͣ�(0.BasePlusCommisionEmployee��1.CommisionEmployee��2.HourlyEmployee��"
                            + "3.SalaridEmployee)");
                    int rand = input.nextInt();
                    
                    while(rand>3||rand<0){
                    	System.out.println("�����������");
                    	System.out.println("������Ա�����ͣ�(0.BasePlusCommisionEmployee��1.CommisionEmployee��2.HourlyEmployee��"
                                + "3.SalaridEmployee)");
                    	rand = input.nextInt();
                    }

                    System.out.println("��������:");
                    firName = input.next();
                    System.out.println("��������:");
                    lastName = input.next();

                    switch (rand) {
                        case 0:
                            System.out.println("�������н:");
                            mBase = input.nextInt();
                            System.out.println("������Ӫ����:");
                            mGross = input.nextDouble();
                            System.out.println("��������ɱ���:");
                            mRate = input.nextDouble();
                            BasePlusCommisionEmployee newStu5 = new BasePlusCommisionEmployee(firName, lastName, id, mGross, mRate, mBase);
                            temp = mFa.updateEmployee(id, newStu5);
                            break;

                        case 1:
                            System.out.println("������Ӫ����:");
                            mGross = input.nextDouble();
                            System.out.println("��������ɱ���:");
                            mRate = input.nextDouble();
                            CommisionEmployee newStu2 = new CommisionEmployee(firName, lastName, id, mGross, mRate);
                            temp = mFa.updateEmployee(id, newStu2);
                            break;

                        case 2:
                            System.out.println("������ʱн:");
                            mWage = input.nextDouble();
                            System.out.println("�����빤��ʱ��:");
                            mHours = input.nextDouble();
                            HourlyEmployee newStu3 = new HourlyEmployee(firName, lastName, id, mWage, mHours);
                            temp = mFa.updateEmployee(id, newStu3);
                            break;

                        case 3:
                            System.out.println("��������н:");
                            mWeeklySalary = input.nextDouble();
                            SalaridEmployee newStu4 = new SalaridEmployee(firName, lastName, id, mWeeklySalary);
                            temp = mFa.updateEmployee(id, newStu4);
                            break;

                    }

                    if (temp != null) {
                        System.out.println("���º�Ա����ϢΪ:\n" + temp.toString() + "earning:" + temp.earning() + "\n\n");
                    } else System.out.println("����ʧ��,���޴�Ա��!");
                    break;

                case 3:
                    System.out.println("������Ҫɾ���Ĺ���:");
                    id = input.next();

                    temp = mFa.deleteEmployee(id);
                    if (temp != null) {
                        System.out.println("ɾ��Ա����Ϣ����:\n" + temp.toString() + "earning:" + temp.earning() + "\n\n");
                    } else System.out.println("ɾ��ʧ�ܣ���Ա��������");
                    break;

                case 4:
                    System.out.println("����Ա����Ŀ��������Ҫ���ҵİ�ȫ֤�ţ�");
                    id = input.next();
                    Employee newStu1 = mFa.getEmployee(id);
                    if (newStu1 == null)
                        System.out.println("�����ڴ�Ա��");
                    else {
                        System.out.println(newStu1.toString() + "earning:" + newStu1.earning() + "\n\n");
                    }
                    break;

                case 5:
                    temp = null;

                    System.out.println("������Ҫ��ӵĹ���:");
                    id = input.next();

                    System.out.println("������Ա�����ͣ�(0.BasePlusCommisionEmployee��1.CommisionEmployee��2.HourlyEmployee��"
                            + "3.SalaridEmployee)");
                    int rand1 = input.nextInt();
                    while(rand1>3||rand1<0){
                    	System.out.println("�����������");
                    	System.out.println("������Ա�����ͣ�(0.BasePlusCommisionEmployee��1.CommisionEmployee��2.HourlyEmployee��"
                                + "3.SalaridEmployee)");
                        rand1 = input.nextInt();
                    }

                    System.out.println("��������:");
                    firName = input.next();
                    System.out.println("��������:");
                    lastName = input.next();

                    switch (rand1) {
                        case 0:
                            System.out.println("�������н:");
                            mBase = input.nextInt();
                            System.out.println("������Ӫ����:");
                            mGross = input.nextDouble();
                            System.out.println("��������ɱ���:");
                            mRate = input.nextDouble();
                            BasePlusCommisionEmployee newStu5 = new BasePlusCommisionEmployee(firName, lastName, id, mGross, mRate, mBase);
                            temp = mFa.addEmployee(newStu5);
                            break;

                        case 1:
                            System.out.println("������Ӫ����:");
                            mGross = input.nextDouble();
                            System.out.println("��������ɱ���:");
                            mRate = input.nextDouble();
                            CommisionEmployee newStu2 = new CommisionEmployee(firName, lastName, id, mGross, mRate);
                            temp = mFa.addEmployee(newStu2);
                            break;

                        case 2:
                            System.out.println("������ʱн:");
                            mWage = input.nextDouble();
                            System.out.println("�����빤��ʱ��:");
                            mHours = input.nextDouble();
                            HourlyEmployee newStu3 = new HourlyEmployee(firName, lastName, id, mWage, mHours);
                            temp = mFa.addEmployee(newStu3);
                            break;

                        case 3:
                            System.out.println("��������н:");
                            mWeeklySalary = input.nextDouble();
                            SalaridEmployee newStu4 = new SalaridEmployee(firName, lastName, id, mWeeklySalary);
                            temp = mFa.addEmployee(newStu4);
                            break;

                    }

                    if (temp != null) {
                        System.out.println("��ӵ�Ա����ϢΪ:\n" + temp.toString() + "earning:" + temp.earning() + "\n\n");
                    } else System.out.println("���ʧ��,���и�Ա��!");
                    break;


                case 6:
                    isOut = true;

                default:
                    System.out.println("����������1-5��\n");
            }

        }
    }
}