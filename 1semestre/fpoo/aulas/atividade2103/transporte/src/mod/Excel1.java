package mod;

import java.util.Date;
import java.util.text.SimpleDateFomat;

public class Excel1 {
	
	private SimpleDateFormat dfabnt = new SimpleDateFormat("dd/MM/yyyy");
	
	public double soma(double Valores[]) {
		double total = 0;
		for(int i = 0; i < Valores.length;i++) {
			total = total + Valores[i];
		}
		return total;
	}
	
	public String hoje() {
		Date data = new Date();
		
	}

}