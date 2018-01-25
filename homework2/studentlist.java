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
		System.out.println("添加成功\n");
		return true;
	}
	
	public boolean remove(int no)
	{
		if(no<0||no>=total+1)
		{
			System.out.println("删除失败\n");
			return false;
		}
		else {
			list.remove(no-1);
			total--;
			System.out.println("删除成功\n");
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
			System.out.println("删除失败\n");
			return false;
		}
			
		else{
			list.remove(i);
			total--;
			System.out.println("删除成功\n");
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
		
		System.out.println("请输入学生学号：");
		number=scan.nextLine();
		System.out.println("请输入学生姓名：");
		name=scan.nextLine();
		System.out.println("请输入学生三门课成绩（数学，英语，科学）：");
		math=scan.nextInt();
		english=scan.nextInt();
		sclence=scan.nextInt();
		
		student astudent=new student(number,name);
		astudent.enterMarks(math, english, sclence);
		add(astudent);
    }
}
