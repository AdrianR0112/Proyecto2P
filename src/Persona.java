public class Persona {
  private String cedula;
  private String nombre;
  private String apellido;
  private String direccion;
  private String telefono;
  private Empleado empleado;
  private Huesped huesped;
  
  public Persona(String cedula, String nombre, String apellido, String direccion, String telefono) {
    this.cedula = cedula;
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.telefono = telefono;
  }
  
  public String getCedula() {
    return cedula;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public String getApellido() {
    return apellido;
  }
  
  public String getDireccion() {
    return direccion;
  }
  
  public String getTelefono() {
    return telefono;
  }
}