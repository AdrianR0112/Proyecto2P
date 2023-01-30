public class Habitacion {
  private int numero;
  private int camas;
  
  public Habitacion(int numero, int camas) {
    this.numero = numero;
    this.camas = camas;
  }
  
  public int getNumero() {
    return numero;
  }
  
  public int getCamas() {
    return camas;
  }
  
  public void setCamas(int camas) {
    this.camas = camas;
  }

    boolean hayCamaDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int reservarCama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}