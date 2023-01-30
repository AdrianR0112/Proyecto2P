
public class Empleado extends Persona {
  private String cargo;
  
  public Empleado(String cedula, String nombre, String apellido, String direccion, String telefono, String cargo) {
    super(cedula, nombre, apellido, direccion, telefono);
    this.cargo = cargo;
  }
  
  public String getCargo() {
    return cargo;
  }
}