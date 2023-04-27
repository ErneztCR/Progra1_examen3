
package ErnestoVargasExamen3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsEncuesta {

    static ArrayList<String> codigo = new ArrayList<>();
    static ArrayList<String> descripcion = new ArrayList<>();
    static ArrayList<Integer> cantidad = new ArrayList<>();
    static ArrayList<Integer> tipo = new ArrayList<>();
    static ArrayList<Boolean> activo = new ArrayList<>();
    static ArrayList<Boolean> precio = new ArrayList<>();
    
    
    static int Activo, Inactivo;
    static int consecutivo;

    public ClsEncuesta() {
        consecutivo = 1;
        Activo = 0;
        Inactivo = 0;
    }

    public ClsEncuesta(String codigo) {
    }

    public static void BuscarPorcodigo(String Codigo) {

        Boolean encontrado = false;
        String Estado = "No esta activo";
        for (int i = 0; i < ClsEncuesta.codigo.size(); i++) {

            if (ClsEncuesta.codigo.get(i).toLowerCase().equals(Codigo.toLowerCase())) {
                encontrado = true;
                if (ClsEncuesta.activo.get(i)) {
                    Estado = "Si esta activo";
                }
                JOptionPane.showMessageDialog(null, "Codigo: " + ClsEncuesta.codigo.get(i) + "\n\nCantidad: "
                        + ClsEncuesta.cantidad.get(i) + "\n\nActivo: " + Estado);
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

    public void setActivo() {
        ClsEncuesta.Activo++;
    }

    public void setInactivo() {
        ClsEncuesta.Inactivo++;
    }

    public static int getConVehiculo() {
        return Activo;
    }

    public static int getSinVehiculo() {
        return Inactivo;
    }

    public void SetSalvarDatos(String Codigo, String Descripcion, int Cantidad, String Tipo, Boolean Activo, String Precio) {
        codigo.add(Codigo);
        descripcion.add(Descripcion);
        cantidad.add(Cantidad);
        tipo.add(Tipo);
        activo.add(Activo);
        precio.add(Precio);
    }

}
