package homework2;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class studenttest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String name;
		String number = null;
		boolean validScore=false,validNumber=false,isdigit=true;
		int math = -1,english=-1,sclence=-1;
		
		Scanner scan=new Scanner(System.in);
		while(!validNumber)
		{
			try{
				System.out.println("请输入学生学号：");
				number=scan.nextLine();
				
				if(number.length()!=10){
					throw new NumberException();
				}
				else{
					
				}
				for(int i=2;i<10;i++)    //是否由数字组成
				{
					if(number.charAt(i)>'9'||number.charAt(i)<'0')
					{
						isdigit=false;
						break;
					}
				}
				if(number.length()==10&&number.charAt(0)=='2'&&number.charAt(1)=='0'&&isdigit)
				{
					validNumber=true;
				}
				else{
					/**
					 * 抛出学号输入异常
					 */
					throw new NumberException();
					
				}
			}
			catch(NumberException aException){
				/**
				 * 捕获学号输入异常
				 */
				System.out.println(aException.toString());
				
			}
		}
	
		System.out.println("请输入学生姓名：");
		name=scan.nextLine();
		
		while(!validScore)
		{
			try{
				System.out.println("请输入学生三门课成绩（数学，英语，科学）：");
				math=scan.nextInt();
				english=scan.nextInt();
				sclence=scan.nextInt();
				
				if(math<=100&&math>=0
					&&english<=100&&english>=0
					&&sclence<=100&&sclence>=0)
				{
					validScore=true;
				}
				else{
					/**
					 * 抛出分数输入异常
					 */
					throw new ScoreException();
				}
			}
			catch(ScoreException aException){
				/**
				 * 捕获分数输入异常
				 */
				System.out.println(aException.toString());
				
			}
		}
		
		
		student astudent=new student(number,name);
		astudent.enterMarks(math, english, sclence);
		
		System.out.println("学生信息如下：");
		System.out.println(astudent.toString());
	}

}
