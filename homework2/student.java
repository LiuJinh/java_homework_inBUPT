package homework2;

public class student {
	private String studentNumber;
	private String studentName;
	int markForMaths=-1;
	int markForEnglish=-1;
	int markForSclence=-1;
	
	public student(String number,String name)
	{
		studentNumber=number;
		studentName=name;
	}
	public student()
	{
		studentNumber="2015211374";
		studentName="ruxingkang";
	}
	
	public String getNumber()
	{
		return studentNumber;
	}
	
	public String getName()
	{
		return studentName;
	}
	
	public void enterMarks(int math,int english,int sclence)
	{
		markForMaths=math;
		markForEnglish=english;
		markForSclence=sclence;
	}
	
	public int getMathsMark()
	{
		return markForMaths;
	}
	
	public int getEnglishMark()
	{
		return markForEnglish;
	}
	
	public int getSclenceMark()
	{
		return markForSclence;
	}
	
	public double calculateAverage()
	{
		double average=(markForMaths+markForEnglish+markForSclence)/3.0;
		return average;
	}
	
	public String toString()
	{
		return "ѧ�ţ�"+studentNumber+"\n������"+studentName+"\n��ѧ�ɼ���"+String.valueOf(markForMaths)
		       +"\nӢ��ɼ���"+String.valueOf(markForEnglish)+"\n��ѧ�ɼ���"+String.valueOf(markForSclence)
		       +"\nƽ���ɼ���"+String.valueOf(calculateAverage());
	}
}
