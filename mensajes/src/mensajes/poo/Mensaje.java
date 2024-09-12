package mensajes.poo;

import java.util.Objects;

public class Mensaje {

	String fecha = null;
	String mes = null;
	String dia = null;
	String hora = null;
	String minuto = null;
	String de = null;
	String para = null;
	String asunto = null;
	String contenido = null;
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getMinuto() {
		return minuto;
	}
	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	@Override
	public int hashCode() {
		return Objects.hash(asunto, contenido, de, dia, fecha, hora, mes, minuto, para);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return Objects.equals(asunto, other.asunto) && Objects.equals(contenido, other.contenido)
				&& Objects.equals(de, other.de) && Objects.equals(dia, other.dia) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(hora, other.hora) && Objects.equals(mes, other.mes)
				&& Objects.equals(minuto, other.minuto) && Objects.equals(para, other.para);
	}
	@Override
	public String toString() {
		return "Mensaje [fecha=" + fecha + ", mes=" + mes + ", dia=" + dia + ", hora=" + hora + ", minuto=" + minuto
				+ ", de=" + de + ", para=" + para + ", asunto=" + asunto + ", contenido=" + contenido + "]";
	}
	
}
