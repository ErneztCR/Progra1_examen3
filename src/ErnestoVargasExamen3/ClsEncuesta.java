package ErnestoVargasExamen3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsEncuesta {

    static ArrayList<String> codigo = new ArrayList<>();
    static ArrayList<String> descripcion = new ArrayList<>();
    static ArrayList<Integer> cantidad = new ArrayList<>();
    static ArrayList<String> tipo = new ArrayList<>();
    static ArrayList<Boolean> activo = new ArrayList<>();
    static ArrayList<String> precio = new ArrayList<>();

    static int Activo, Inactivo;
    static int consecutivo;

    public ClsEncuesta() {
        consecutivo = 0;
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
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "NO existe");
        }
    }

    public void setActivo() {
        ClsEncuesta.Activo++;
        ClsEncuesta.consecutivo = ClsEncuesta.Activo + ClsEncuesta.Inactivo;
    }

    public void setInactivo() {
        ClsEncuesta.Inactivo++;
        ClsEncuesta.consecutivo = ClsEncuesta.Activo + ClsEncuesta.Inactivo;
    }

    public static int getActivo() {
        return Activo;
    }

    public static int getInactivo() {
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

    public static int getTotalCantidad() {
        int lcantidad = 0; // Variable auxiliar para acumular la suma de todas las cantidades

        for (int i = 0; i < cantidad.size(); i++) {
            lcantidad += cantidad.get(i);
        }

        return lcantidad;
    }
    
    public static double getPromedioPrecio() {
    double sumaPrecio = 0;
    for (int i = 0; i < precio.size(); i++) {
        sumaPrecio += Double.parseDouble(precio.get(i));
    }
    return sumaPrecio / precio.size();
}

}
