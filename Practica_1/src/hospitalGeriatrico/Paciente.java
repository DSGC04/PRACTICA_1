package hospitalGeriatrico;
import java.time.LocalDate;
import java.util.Objects;

public class Paciente {

	private String nombreCompleto;
	private LocalDate fechaDeNacimiento;
	private String direccion;
	private Long numeroTelefonico;
	private String curp;
	
	public Paciente(String nombreCompleto, LocalDate fechaDeNacimiento, String direccion, Long numeroTelefonico,
			String curp) {
		this.nombreCompleto = nombreCompleto;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.direccion = direccion;
		this.numeroTelefonico = numeroTelefonico;
		this.curp = curp;
	}

	public Paciente(String nombreCompleto, LocalDate fechaDeNacimiento, String curp) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.curp = curp;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNumeroTelefonico(Long numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curp, direccion, fechaDeNacimiento, nombreCompleto, numeroTelefonico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(curp, other.curp) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(fechaDeNacimiento, other.fechaDeNacimiento)
				&& Objects.equals(nombreCompleto, other.nombreCompleto)
				&& Objects.equals(numeroTelefonico, other.numeroTelefonico);
	}

	@Override
	public String toString() {
		return "Paciente [nombreCompleto=" + nombreCompleto + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", direccion=" + direccion + ", numeroTelefonico=" + numeroTelefonico + ", curp=" + curp + "]";
	}
	
	
	
}
