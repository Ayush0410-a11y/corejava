package Basic;

public class AcessModifierExampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("current value of stat is : "+acessmodi.stat);
		acessmodi.methodstatic();
		acessmodi e1 = new acessmodi();
		e1.pbl = 'x';
		System.out.println("current value of pbl: "+e1.pbl);
		e1.methodPublic(10);
		e1.methodprotected();
	}

}
