import java.util.ArrayList;

public class Empresa {
    private ArrayList<Cliente> listaclientes = new ArrayList<>();
    private ArrayList<Servicio> listaservicios = new ArrayList<>();
    private ArrayList<Tecnico> listatecnicos = new ArrayList<>();
    private ArrayList<Proyecto> listaproyectos = new ArrayList<>();

    // Métodos de administración 
    public void agregarcliente(Cliente c) { listaclientes.add(c); }
    public void agregarservicio(Servicio s) { listaservicios.add(s); }
    public void agregartecnico(Tecnico t) { listatecnicos.add(t); }
    public void crearProyecto(Proyecto p) { listaproyectos.add(p); }

    // El método ahora busca el proyecto y le pide que se cancele 
    public void cancelarproyecto(int id) {
        for (Proyecto p : listaproyectos) {
            if (p.getIdProyecto() == id) {
                p.cancelarproyecto();
                System.out.println("Proyecto " + id + " ha sido cancelado.");
                return;
            }
        }
        System.out.println("No se encontró el proyecto.");
    }

    public void reportedeudas() {
        System.out.println("--- Reporte de Deudas ---");
        for (Proyecto p : listaproyectos) {
            if (p.obtenerSaldopendiente() > 0) { 
                p.mostrarresumen();
            }
        }
    }
}