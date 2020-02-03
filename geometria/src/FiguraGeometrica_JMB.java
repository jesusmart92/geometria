
public abstract class FiguraGeometrica_JMB {

	protected String tipoFigura;

	public FiguraGeometrica_JMB(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();

	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
