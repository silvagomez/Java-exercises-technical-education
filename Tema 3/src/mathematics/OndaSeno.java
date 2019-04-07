package mathematics;

public class OndaSeno {
	int i,l,m,n,o;
	double j,a,b,c,d;
	
	OndaSeno(){
		
	}
	
	void drawSeno() {
		for (i=0;i<=13;i++){
			//a=Math.PI;
			//c=2*i*a/13;
			//b=Math.sin(c);
			//m=(int) Math.round(8+(8*b));
			m=(int) Math.round(8+(8*Math.sin(2*i*Math.PI/13)));
			for (l=0;l<=m;l++) {
				System.out.print(" ");
			}
			System.out.println("*");	
		}
	}
	
	void drawSeno2() {
		for (i=0;i<=13;i++){
			//a=Math.PI;
			//c=2*i*a/13;
			//b=Math.sin(c);
			//m=(int) Math.round(8+(8*b));
			m=(int) Math.round(8+(8*Math.sin(2*i*Math.PI/13)));
			System.out.print(m);
			for (l=0;l<=m;l++) {
				System.out.print(" ");
			}
			System.out.println("*");	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OndaSeno obj= new OndaSeno();
		//obj.drawSeno();
		obj.drawSeno2();
		
		

	}

}
