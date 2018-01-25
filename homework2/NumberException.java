package homework2;

public class NumberException extends Exception{
	public NumberException()
	{
		super("学号输入异常，请重新输入：");
	}
}
