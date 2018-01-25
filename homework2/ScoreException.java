package homework2;

public class ScoreException extends Exception{
	public  ScoreException()
	{
		super("成绩输入异常，请重新输入：");
	}
}
