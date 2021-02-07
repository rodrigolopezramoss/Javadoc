package videojuegos;

import java.util.Objects;


/**
 * <p>
 * Videojuegos es una clase que permite la gestión de videojuegos
 * </p>
 * <p>
 * Nos permite crear videojuegos desde tres posibilidades iniciales:
 * Por defecto, con solo el {@code titulo} y el número de {@code horas}; y 
 * </p>
 * @author Yo
 * @version 0.1.0
 */
public class Videojuegos {

	/** Define el identificador	*/
	private String id;
	
	/**	Define el titulo */
	private String titulo;
	
	/**	Define las horas de juego, por defecto son 10 */
	private int horas = 10;
	
	/**	Define el género */
	private String genero;
	
	/**	Define la compañía a la que pertenece el juego */
	private String companya;
	
	/**	Nos dice si el juego esta o no alquilado, falso por defecto */
	private boolean alquilado = false;
	
	/**
	 * Constructor de la clase
	 * @param id
	 * @param titulo
	 * @param horas
	 * @param genero
	 * @param companya
	 */
	public Videojuegos(String id, String titulo, int horas, String genero, String companya) {
		this.id = id;
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.companya = companya;
	}
	
	/**
	 * @return el {@code id}
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id el id a establecer
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return el número de {@code horas}
	 */
	public int getHoras() {
		return horas;
	}
	
	/**
	 * @param horas las horas a establecer
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	
	/**
	 * @return el {@code titulo}
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo el título a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return el {@code genero}
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero el género a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return la {@code companya}
	 */
	public String getCompanya() {
		return companya;
	}

	/**
	 * @param companya la compañía a establecer
	 */
	public void setCompanya(String companya) {
		this.companya = companya;
	}

	/**
	 * Torna {@code alquilado} a verdadero
	 */
	public void entregar() {
		this.alquilado = true;
	}
	
	/**
	 * Torna {@code alquilado} a falso
	 */
	public void devolver() {
		this.alquilado = false;
	}
	
	/**
	 * Nos dice si un juego está alquilado o no
	 * @return el valor de {@code alquilado}
	 */
	public boolean esEntregado() {
		return this.alquilado;
	}
	
	/**
	 * Compara las horas de juego de dos videojuegos y nos dice cual tiene más
	 * @param v1 valor de las horas del primer videojuego dado
	 * @param v2 valor de las horas del segundo videojuego
	 * @return <b>0</b> si el primer juego tiene más horas que el segundo, <b>1</b> al contrario y <b>2</b> si ambos tienen las mismas horas
	 */
	public int comparar(int v1, int v2) {
		if (v1 < v2) {
			return 0;
		}else if(v1 > v2){
			return 1;
		}else {
			return 2;
		} 
	}
	
	
	@Override
	public String toString() {
		String cadena = "";
		cadena += "\n===================";
		cadena += "\nTítulo: " + this.titulo;
		cadena += "\nHoras de juego: " + this.horas;
		cadena += "\n===================";
		return cadena;
	}
	
	
	public int hashCode() {
		int hash = 3;
		hash = 59 * hash + Objects.hashCode(this.titulo);
		return hash;
	}
}
