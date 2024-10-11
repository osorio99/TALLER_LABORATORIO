package flecha;

public class Principal {
	flecha flecha1,flecha2,flecha3;
	 public static void main(String[] args) {
	        Principal miPrincipal=new Principal();
	    }

	    public Principal() {
	        flecha1=new flecha();
	        flecha1.construirFlecha();
	        flecha1.imprimirEspacio();

	        flecha2=new flecha();
	        flecha2.longitud=34;
	        flecha2.color="rojo";
	        flecha2.construirFlecha();
	        flecha2.imprimirEspacio();

	        flecha3=new flecha(12,"negro");
	        flecha3.construirFlecha();
	        flecha3.imprimirEspacio();
	    }

}
