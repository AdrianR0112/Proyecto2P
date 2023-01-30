import java.util.ArrayList;

public class Hostal {
  private ArrayList<Habitacion> habitaciones;
  private ArrayList<IngresoSalida> ingresoSalidas;
  private int huespedesAtendidos;
  private int huespedesAlojados;
  
  public Hostal() {
    this.habitaciones = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      this.habitaciones.add(new Habitacion(i + 1));
    }
    this.ingresoSalidas = new ArrayList<>();
    this.huespedesAtendidos = 0;
    this.huespedesAlojados = 0;
  }
  
  public void registrarIngreso(Huesped huesped, int costo) {
    for (Habitacion habitacion : habitaciones) {
      if (habitacion.hayCamaDisponible()) {
        int cama = habitacion.reservarCama();
        IngresoSalida ingresoSalida = new IngresoSalida(huesped, habitacion.getNumero(), cama, costo);
        this.ingresoSalidas.add(ingresoSalida);
        this.huespedesAtendidos++;
        this.huespedesAlojados++;
        break;
      }
    }
  }
  
  public void registrarSalida(Huesped huesped) {
    for (IngresoSalida ingresoSalida : ingresoSalidas) {
      if (ingresoSalida.getHuesped().equals(huesped)) {
        Habitacion habitacion = habitaciones.get(ingresoSalida.getNumeroHabitacion()- 1);
        habitacion.liberarCama(ingresoSalida.getNumeroCama());
        this.huespedesAlojados--;
        break;
      }
    }
  }
  
  public void verificarDisponibilidad() {
    int camasDisponibles = 0;
    for (Habitacion habitacion : habitaciones) {
      camasDisponibles += habitacion.getCamasDisponibles();
    }
    System.out.println("Camas disponibles: " + camasDisponibles);
  }
  
  public void imprimirDatosGenerales() {
    System.out.println("Huéspedes atendidos: " + this.huespedesAtendidos);
    System.out.println("Huéspedes alojados: " + this.huespedesAlojados);
  }
  
  public void imprimirAtributos(IngresoSalida ingresoSalida) {
    Huesped huesped = ingresoSalida.getHuesped();
    System.out.println("Cédula: " + huesped.getCedula());
    System.out.println("Nombre: " + huesped.getNombre());
     System.out.println("Apellido: " + huesped.getApellido());
    System.out.println("Dirección: " + huesped.getDireccion());
    System.out.println("Teléfono: " + huesped.getTelefono());
    System.out.println("País de origen: " + huesped.getPaisOrigen());
    System.out.println("Reserva: " + huesped.getReserva());
    System.out.println("Hospedaje: " + huesped.getHospedaje());
    System.out.println("Temperatura: " + huesped.getTemperatura());
    System.out.println("Fecha de ingreso: " + ingresoSalida.getFechaIngreso());
    System.out.println("Costo por día: " + ingresoSalida.getCosto());
    System.out.println("Número de habitación: " + ingresoSalida.getNumeroHabitacion());
    System.out.println("Número de cama: " + ingresoSalida.getNumeroCama());
  }
}