package homework2;

import java.util.Scanner;

public class studentlisttest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		int way=0;
		String number;
		int no;
		boolean isout=true;
		Scanner scan=new Scanner(System.in);
		studentlist stulst=new studentlist();
		while(isout)
		{
			System.out.println("�˵����£������� 1-8������Ҫִ�еĲ�����"+"\n1.����һ��ѧ��    "
					+"\n2.����ѧ��ɾ��ѧ��"+"\n3.����λ��ɾ��ѧ��"+"\n4.�ж��Ƿ�Ϊ��"+"\n5.����λ�÷���ѧ��"
					+"\n6.����ѧ�ŷ���ѧ��"+"\n7.���ȫ����Ϣ"+"\n8.�˳�����");
			way=scan.nextInt();
			switch(way)
			{
			case 1:
				stulst.add();
				break;
			case 2:
				System.out.println("������ѧ��֤�ţ�");
				number=scan.next();
				stulst.remove(number);
				break;
			case 3:
				System.out.println("������ѧ��λ�ã�\n");
				no=scan.nextInt();
				stulst.remove(no);
				break;
			case 4:
				System.out.println(stulst.isempty());
				break;
			case 5:
				System.out.println("������ѧ��λ�ã�\n");
				no=scan.nextInt();
				System.out.println(stulst.gettem(no).toString());;
				break;
			case 6:
				System.out.println("������ѧ��֤�ţ�");
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
