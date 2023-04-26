
package ErnestoVargasExamen3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsEncuesta {

    static ArrayList<String> nombre = new ArrayList<>();
    static ArrayList<Boolean> carro = new ArrayList<>();
    static ArrayList<Integer> edad = new ArrayList<>();
    static ArrayList<String> correo = new ArrayList<>();
    static int ConVehiculo, SinVehiculo;
    static int consecutivo;

    public ClsEncuesta() {
        consecutivo = 1;
        ConVehiculo = 0;
        SinVehiculo = 0;
    }

    public ClsEncuesta(String nombre) {
    }

    public static void BuscarPornombre(String Nombre) {

        Boolean encontrado = false;
        String Vehiculo = "No tiene Vehiculo";
        for (int i = 0; i < ClsEncuesta.nombre.size(); i++) {

            if (ClsEncuesta.nombre.get(i).toLowerCase().equals(Nombre.toLowerCase())) {
                encontrado = true;
                if (ClsEncuesta.carro.get(i)) {
                    Vehiculo = "Si tiene Vehiculo";
                }
                JOptionPane.showMessageDialog(null, "Nombre: " + ClsEncuesta.nombre.get(i) + "\n\nEdad: "
                        + ClsEncuesta.edad.get(i) + "\n\nCarro: " + Vehiculo);
                break;
            }

        }
        if (!encontrado)
            JOptionPane.showMessageDialog(null, "NO existe");
    }

    // Get para ver el siguiente numero de la encuesta
    public static int getConsecutivo() {
        return consecutivo;
    }

    // Set para asignar un nuevo numero de encuesta
    public void setConsecutivo() {
        ClsEncuesta.consecutivo++;
    }

    public void setConVehiculo() {
        ClsEncuesta.ConVehiculo++;
    }

    public void setSinVehiculo() {
        ClsEncuesta.SinVehiculo++;
    }

    public static int getConVehiculo() {
        return ConVehiculo;
    }

    public static int getSinVehiculo() {
        return SinVehiculo;
    }

    public void SetSalvarDatos(String Nombre, Boolean Carro, int Edad, String Correo) {
        nombre.add(Nombre);
        carro.add(Carro);
        edad.add(Edad);
        correo.add(Correo);
    }

}
