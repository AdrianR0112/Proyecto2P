
public class Huesped extends Persona {
  private boolean reserva;
  private boolean hospedaje;
  private int temperatura;
  private String paisOrigen;
  
  public Huesped(String cedula, String nombre, String apellido, String direccion, String telefono, boolean reserva, boolean hospedaje, int temperatura, String paisOrigen) {
    super(cedula, nombre, apellido, direccion, telefono);
    this.reserva = reserva;
    this.hospedaje = hospedaje;
    this.temperatura = temperatura;
    this.paisOrigen = paisOrigen;
  }
  
  public boolean getReserva() {
    return reserva;
  }
  
  public boolean getHospedaje() {
    return hospedaje;
  }
  
  public int getTemperatura() {
    return temperatura;
  }
  
  public String getPaisOrigen() {
    return paisOrigen;
  }
}