package homework2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class studentlist {
	private ArrayList<student> list;
	//private student[] list;
	private int total=0;
	
	public studentlist()
	{
		list=new ArrayList<student>();
	}
	
	public boolean add(student stu)
	{
		list.add(stu);
		total++;
		System.out.println("��ӳɹ�\n");
		return true;
	}
	
	public boolean remove(int no)
	{
		if(no<0||no>=total+1)
		{
			System.out.println("ɾ��ʧ��\n");
			return false;
		}
		else {
			list.remove(no-1);
			total--;
			System.out.println("ɾ���ɹ�\n");
			return true;
		}
	}
	
	public boolean remove(String number)
	{
		int i=0;
		for(;i<list.size();i++)
		{
			if(list.get(i).getNumber().equals(number)) break;
		}
		
		if(i>=list.size()){
			System.out.println("ɾ��ʧ��\n");
			return false;
		}
			
		else{
			list.remove(i);
			total--;
			System.out.println("ɾ���ɹ�\n");
			return true;
		}
	}
	
	public boolean isempty()
	{
		return list.isEmpty();
	}
	
	public student gettem(int no)
	{
		return list.get(no);
	}
	
	public student gettem(String number)
	{
		int i=0;
		for(;i<=list.size();i++)
		{
			if(list.get(i).getNumber().equals(number)) return list.get(i);;
		}
		return null;
	}
	
    public int gettotal()
    {
    	return total;
    }
    
    
    public void add(){
    	String name;
		String number;
		int math,english,sclence;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("������ѧ��ѧ�ţ�");
		number=scan.nextLine();
		System.out.println("������ѧ��������");
		name=scan.nextLine();
		System.out.println("������ѧ�����ſγɼ�����ѧ��Ӣ���ѧ����");
		math=scan.nextInt();
		english=scan.nextInt();
		sclence=scan.nextInt();
		
		student astudent=new student(number,name);
		astudent.enterMarks(math, english, sclence);
		add(astudent);
    }
}
