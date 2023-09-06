package conversorMonedas;

import javax.swing.JOptionPane;

public class convertirMonedasAPesos {
	public void convertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 3739.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
	}
	
	public void convertirEurosAPesos(double valor) {
		double monedaEuro = valor * 4050.48;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
	}
	
	public void convertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 4890.52;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
	}
	
	public void convertirYenAPesos(double valor) {
		double monedaYen = valor * 29.68;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
	}
	
	public void convertirWonAPesos(double valor) {
		double monedaWon = valor * 3.04;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
	}
}
