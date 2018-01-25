package homework2;

import java.util.Scanner;

public class studentlisttest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int way=0;
		String number;
		int no;
		boolean isout=true;
		Scanner scan=new Scanner(System.in);
		studentlist stulst=new studentlist();
		while(isout)
		{
			System.out.println("菜单如下，请输入 1-8代表您要执行的操作："+"\n1.增加一个学生    "
					+"\n2.根据学号删除学生"+"\n3.根据位置删除学生"+"\n4.判断是否为空"+"\n5.根据位置返回学生"
					+"\n6.根据学号返回学生"+"\n7.输出全部信息"+"\n8.退出程序");
			way=scan.nextInt();
			switch(way)
			{
			case 1:
				stulst.add();
				break;
			case 2:
				System.out.println("请输入学生证号：");
				number=scan.next();
				stulst.remove(number);
				break;
			case 3:
				System.out.println("请输入学生位置：\n");
				no=scan.nextInt();
				stulst.remove(no);
				break;
			case 4:
				System.out.println(stulst.isempty());
				break;
			case 5:
				System.out.println("请输入学生位置：\n");
				no=scan.nextInt();
				System.out.println(stulst.gettem(no).toString());;
				break;
			case 6:
				System.out.println("请输入学生证号：");
				number=scan.next();
				System.out.println(number);
				System.out.println(stulst.gettem(number).toString());;
				break;
			case 7:
				for(int i=0;i<stulst.gettotal();i++)
					System.out.println(stulst.gettem(i).toString());
				break;
			case 8:
				isout=false;
				break;
		    default:
		    	break;
			}
			System.out.println("\n\n");
		}
		System.out.println("over");
	}

}
