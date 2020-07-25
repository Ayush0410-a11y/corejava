package Basic;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		long l=i;
		float f=l;
		System.out.println("interger: "+i);
		System.out.println("long: "+l);
		System.out.println("float: "+f);
		
		double d= 20.99;
		f= (float)d;
		l= (long)f;
		i= (int)l;
		System.out.println("double: "+d);
		System.out.println("float: "+f);
		System.out.println("long: "+l);
		System.out.println("int: "+i);
       
	}

}
