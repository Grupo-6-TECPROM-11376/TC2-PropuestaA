package Programa;

public class Profesores {
	private int código;
	private double créditosMáximosDictado;
	private char tipoDeProfesor;
	private String nombre;
	/*
	Aquí debería ir la parte de las horas Disponibles, pero aún no se
	implementar eso
	*/
	
	//Setters and Getters
	public int getCódigo() {
		return código;
	}
	public void setCódigo(int código) {
		this.código = código;
	}
	public double getCréditosMáximosDictado() {
		return créditosMáximosDictado;
	}
	public void setCréditosMáximosDictado(double créditosMáximosDictado) {
		this.créditosMáximosDictado = créditosMáximosDictado;
	}
	public char getTipoDeProfesor() {
		return tipoDeProfesor;
	}
	public void setTipoDeProfesor(char tipoDeProfesor) {
		this.tipoDeProfesor = tipoDeProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructor
	public Profesores(int código, double créditosMáximosDictado, char tipoDeProfesor, String nombre) {
		super();
		this.código = código;
		this.créditosMáximosDictado = créditosMáximosDictado;
		this.tipoDeProfesor = tipoDeProfesor;
		this.nombre = nombre;
	}
	
	
	//private Hora horasDisponible;
}
