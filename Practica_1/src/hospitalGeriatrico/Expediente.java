package hospitalGeriatrico;

import java.util.Arrays;
import java.util.Objects;

public class Expediente {
	
	private Paciente paciente;
	private Consulta[] consultas;
	private int indice;
	private int cantidadDeConsultas;
	private int posicion;
	private static final int MAX_CONSULTA=52;
	private static final int MIN_INDICE=-1;
	
	public Expediente(Paciente paciente) {
		this.paciente = paciente;
		consultas= new Consulta [MAX_CONSULTA];
		indice=MIN_INDICE;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void agregraConsulta(Consulta consulta) {
		if(indice<MAX_CONSULTA-1) {
			consultas[++indice]=consulta;
		}
	}

	public int getCantidadDeConsultas() {
		return indice+1;
	}
	
	public Consulta getConsulta(int posicion) {
		if(posicion<indice)
			return consultas[posicion];
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(consultas);
		result = prime * result + Objects.hash(cantidadDeConsultas, indice, paciente, posicion);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return cantidadDeConsultas == other.cantidadDeConsultas && Arrays.equals(consultas, other.consultas)
				&& indice == other.indice && Objects.equals(paciente, other.paciente) && posicion == other.posicion;
	}

	@Override
	public String toString() {
		return "Expediente [paciente=" + paciente + ", consultas=" + Arrays.toString(consultas) + ", indice=" + indice
				+ ", cantidadDeConsultas=" + cantidadDeConsultas + ", posicion=" + posicion + "]";
	}

	
	
	
}
