/**
 * 
 * @author jesus
 *
 */

public class Circulo_JMB extends FiguraGeometrica_JMB {
	private double radio;
	// Constante pi
	static final double PI = 3.1416;

	public Circulo_JMB(double r, String tipoFigura) {
		super(tipoFigura);
		if (r < 0) {
			radio = r * -1;
		}
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}

	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
