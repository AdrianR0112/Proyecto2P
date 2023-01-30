import java.util.Date;

public class IngresoSalida {
  private Huesped huesped;
  private Habitacion habitacion;
  private Date fechaIngreso;
  private int costoPorDia;
  private int cama;
  
  public IngresoSalida(Huesped huesped, Habitacion habitacion, Date fechaIngreso, int costoPorDia, int cama) {
    this.huesped = huesped;
    this.habitacion = habitacion;
    this.fechaIngreso = fechaIngreso;
    this.costoPorDia = costoPorDia;
    this.cama = cama;
  }
  
  public Huesped getHuesped() {
    return huesped;
  }
  
  public Habitacion getHabitacion() {
    return habitacion;
  }
  
  public Date getFechaIngreso() {
    return fechaIngreso;
  }
  
  public int getCostoPorDia() {
    return costoPorDia;
  }
  
  public int getCama() {
    return cama;
  }

    String getCosto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNumeroHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNumeroCama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}