package Construtors;

public class ZeroArgumentConstructor {
	private String s;
	private int i;
	private boolean b;
	ZeroArgumentConstructor()
	{
		s="ABCD";
		i=20;
		b=true;		
	}
	public static void main(String[] args) {
		ZeroArgumentConstructor z= new ZeroArgumentConstructor();
		System.out.println("s="+z.s);
		System.out.println("i="+z.i);
		System.out.println("b="+z.b);
		
	}

}
