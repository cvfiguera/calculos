package cl.calculos.business.util;

public enum TiposArchivo {
	
	RESUMEN_DISPONIBILIDAD(1, "Resumen Disponibilidad"),
	RESUMEN_VELOCIDAD(2, "Resumen Velocidad"),
	DETALLE_DISPONIBILIDAD(3, "Detalle Disponibilidad"),
	DETALLE_VELOCIDAD_BAJADA(4, "Detalle V. Bajada"),
	DETALLE_VELOCIDAD_SUBIDA(5, "Detalle V. Subida"),
	PREFACTURA(6, "Prefactura"),
	BITACORA(7, "Bitacora"),
	PREFACTURACION(8, "Prefacturacion");
	
	private final Integer cod;
	private final String nombre;
	
	TiposArchivo(Integer cod, String nombre) {
		this.cod = cod;
		this.nombre = nombre;
	}
	
	public Integer cod() {
		return cod;
	}
	
	public String nombre() {
		return nombre;
	}
}
