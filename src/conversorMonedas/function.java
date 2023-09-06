package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	convertirMonedas monedas = new convertirMonedas();
	convertirMonedasAPesos pesos = new convertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.convertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.convertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.convertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.convertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.convertirWonAPesos(Minput);
            break;
        }      
    }
}
