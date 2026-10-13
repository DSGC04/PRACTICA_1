package hospitalGeriatrico;
import java.time.LocalDate;
import java.util.Objects;


public class Consulta {
	
	private LocalDate fechaDeConsulta;
	private String diagnostico;
	private String receta;
	private Paciente paciente;
	
	public Consulta(LocalDate fechaDeConsulta, String diagnostico, String receta, Paciente paciente) {
		super();
		this.fechaDeConsulta = fechaDeConsulta;
		this.diagnostico = diagnostico;
		this.receta = receta;
		this.paciente = paciente;
	}
	
	public LocalDate getFechaDeConsulta() {
		return fechaDeConsulta;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public Paciente getPaciente() {
		return paciente;
	}

	@Override
	public String toString() {
		return "Consulta [fechaDeConsulta=" + fechaDeConsulta + ", diagnostico=" + diagnostico + ", receta=" + receta
				+ ", paciente=" + paciente + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diagnostico, fechaDeConsulta, paciente, receta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(diagnostico, other.diagnostico) && Objects.equals(fechaDeConsulta, other.fechaDeConsulta)
				&& Objects.equals(paciente, other.paciente) && Objects.equals(receta, other.receta);
	}
	
	
	 

}
