package com.axa.modelos;

/* 
 * Clase Excepcion:
 * Se persistira esta informaci�n dentro del documento 
 * en el campo de excepciones.
 * */

public class Excepcion {

	/* Adici�n, Movimiento, Transformaci�n, Validaci�n */
	private String tipo;
	/* Etiqueta del campo donde ocurrio la excepci�n */
	private String campo;
	/* Detalle de la excepci�n */
	private String detalle;

	public Excepcion() {
		super();
	}

	public Excepcion(String tipo, String campo, String detalle) {
		super();
		this.tipo = tipo;
		this.campo = campo;
		this.detalle = detalle;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Excepcion [tipo=" + tipo + ", campo=" + campo + ", detalle=" + detalle + "]";
	}
}
