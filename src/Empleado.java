
import javax.swing.JOptionPane;



public class Empleado extends Persona{
    double sueldo;
    String telefono,direccion;
 public Empleado(String nom,int ed,double suel,String tel,String dir){   
  super(nom, ed);
  this.sueldo = suel;
  this.telefono = tel;
  this.direccion = dir;
  }
    @Override
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre:"+ nombre+ "\nEdad:"+edad + "\nSueldo:"+sueldo+"\nTelefono:"+telefono
        +"\nDirección"+direccion,"Datos del Empleado",JOptionPane.INFORMATION_MESSAGE);
}
}