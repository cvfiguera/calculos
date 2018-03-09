package cl.calculos.model.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import cl.calculos.model.vo.ResumenArchivo;

@Repository
public class ArchivoDaoImpl extends HibernateControl implements ArchivoDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<ResumenArchivo> getArchivosMes(Integer operadora, String year, String month) {
		
		String sql = "SELECT b.id, archivo.archivo_tipo_id as codTipo, archivos_tipos.tipo, archivo.nombre_archivo as nombre, b.version, archivo.fecha_ftp as fecha, b.codEstado, estados.estado "
				+ "from (SELECT a.id, max(a.estado) as codEstado, max(archivo.version) as version "
				+ "FROM control.archivo, (SELECT procesos_detalle.archivo_id as id, procesos_detalle.nombre_archivo as nombre, max(estados.codigo) as estado "
				+ "FROM control.estados, control.procesos_detalle WHERE procesos_detalle.estado_archivo_id = estados.estado_archivo_id and estados.codigo > 7 GROUP BY id, nombre) a "
				+ "WHERE archivo.archivo_id= a.id AND archivo.nombre_archivo= a.nombre GROUP BY id) b INNER JOIN control.archivo ON (archivo.archivo_id = b.id ANd archivo.version= b.version) "
				+ "INNER JOIN control.estados ON (estados.codigo = b.codEstado) INNER JOIN control.archivos_tipos ON (archivos_tipos.archivo_tipo_id = archivo.archivo_tipo_id) "
				+ "WHERE archivo.operadora_id = " + operadora + " AND archivo.mes = '" + month + "' AND archivo.ano = '" + year +"' "
				+ "ORDER BY id, codigo";
		
		return (List<ResumenArchivo>) this.getObjectListSql(new ResumenArchivo(), sql);
	}
}
