package homework2;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class studenttest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String name;
		String number = null;
		boolean validScore=false,validNumber=false,isdigit=true;
		int math = -1,english=-1,sclence=-1;
		
		Scanner scan=new Scanner(System.in);
		while(!validNumber)
		{
			try{
				System.out.println("������ѧ��ѧ�ţ�");
				number=scan.nextLine();
				
				if(number.length()!=10){
					throw new NumberException();
				}
				else{
					
				}
				for(int i=2;i<10;i++)    //�Ƿ����������
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
					 * �׳�ѧ�������쳣
					 */
					throw new NumberException();
					
				}
			}
			catch(NumberException aException){
				/**
				 * ����ѧ�������쳣
				 */
				System.out.println(aException.toString());
				
			}
		}
	
		System.out.println("������ѧ��������");
		name=scan.nextLine();
		
		while(!validScore)
		{
			try{
				System.out.println("������ѧ�����ſγɼ�����ѧ��Ӣ���ѧ����");
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
					 * �׳����������쳣
					 */
					throw new ScoreException();
				}
			}
			catch(ScoreException aException){
				/**
				 * ������������쳣
				 */
				System.out.println(aException.toString());
				
			}
		}
		
		
		student astudent=new student(number,name);
		astudent.enterMarks(math, english, sclence);
		
		System.out.println("ѧ����Ϣ���£�");
		System.out.println(astudent.toString());
	}

}
