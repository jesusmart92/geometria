/**
 * 
 * @author jesus martinez beltran
 * @version 1.2
 *
 */
public class Rectangulo_JMB extends FiguraGeometrica {
	private double l1;
	private double l2;
	

	 */
	public Rectangulo_JMB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	 /**
	  * 
	  * @return Devuelve el area del rectangulo
	  */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * 
	 * @return Devuelve el perimetro del rectangulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
