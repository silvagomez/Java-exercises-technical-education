package programas;

import aves.*;
import aves.tropicales.*;
import aves.pajaros.*;
import estrellasTV.*;

public class MiPrograma{

	public MiPrograma() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piolin p1 = new Piolin('H', (byte) 12, 5.5f, 50);
		Loro l1 = new Loro('M', (byte) 25, 's', "Rojo" );
		p1.quienSoy();
		l1.quienSoy();
		p1.altura();
		l1.deDondeEres();
		p1.setSize(18.2f);
		p1.altura();
		l1.setRegion('e');
		l1.deDondeEres();
		
		Piolin.visualizar();

	}

}
