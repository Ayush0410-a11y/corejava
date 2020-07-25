package Basic;

public class acessmodi {

	 
		// TODO Auto-generated method stub
		private int pvy =0;
		public char pbl;
		static String stat = "";
		public final String lang ="java";
		public void methodPublic(int arg1) {
			System.out.println("setting pvy to "+arg1);
			methodPrivate(arg1);
		}
		private void methodPrivate(int arg1) {
			// TODO Auto-generated method stub
			pvy = arg1;
			
		}
		protected void methodprotected() {
			System.out.println("current value of pvy: "+pvy);
			
		}
		static void methodstatic() {
			stat = "simple";
			System.out.println("current value of stat: "+stat);
			
		}
		

	

}
