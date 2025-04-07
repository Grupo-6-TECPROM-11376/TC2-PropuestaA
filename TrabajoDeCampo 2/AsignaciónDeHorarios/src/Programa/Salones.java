package Programa;

public class Salones {
	private String nombreDelSalón;
	private char tipoDeSalón;
	//private Horas horariosDisponibles;
	//OBS:no sabemos implementar arreglos en Java aún ni implementar una clase dentro de otra
	public String getNombreDelSalón() {
		return nombreDelSalón;
	}
	public void setNombreDelSalón(String nombreDelSalón) {
		this.nombreDelSalón = nombreDelSalón;
	}
	public char getTipoDeSalón() {
		return tipoDeSalón;
	}
	public void setTipoDeSalón(char tipoDeSalón) {
		this.tipoDeSalón = tipoDeSalón;
	}
	public Salones(String nombreDelSalón, char tipoDeSalón) {
		super();
		this.nombreDelSalón = nombreDelSalón;
		this.tipoDeSalón = tipoDeSalón;
	}
	
	
}
