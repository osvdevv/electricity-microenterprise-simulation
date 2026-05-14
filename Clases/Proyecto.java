public class Proyecto {
    private int idProyecto;
    private Cliente cliente;
    private Servicio servicio;
    private Tecnico tecnico;
    private Consumo_Energetico consumo;
    private double costoTotalP;
    private double totalPagadoP;
    private String estadoP;

    public Proyecto(int id, Cliente c, Servicio s, Tecnico t, Consumo_Energetico con) {
        this.idProyecto = id;
        this.cliente = c;
        this.servicio = s;
        this.tecnico = t;
        this.consumo = con;
        this.totalPagadoP = 0;
        this.estadoP = "PENDIENTE";
    }

    // Lógica de cálculo de costo solicitado 
    public void calcularCostoTotal(double precioPorKwh) {
        double costoConsumo = consumo.calcularConsumo() * precioPorKwh;
        this.costoTotalP = servicio.obtenercostobase() + costoConsumo;
    }

    public void iniciarproyecto() {
        this.estadoP = "EN_PROCESO"; 
        tecnico.asignar(); 
    }

    public void finalizarproyecto() {
        this.estadoP = "TERMINADO";  
        tecnico.liberar(); 
    }

    public void cancelarproyecto() {
        this.estadoP = "CANCELADO"; 
        tecnico.liberar(); 
    }

    public double obtenerSaldopendiente() {
        return costoTotalP - totalPagadoP; 
    }

    public void registrarpago(double monto) {
        this.totalPagadoP += monto; 
    }

    public int getIdProyecto() { return idProyecto; }
    
    public void mostrarresumen() {
        System.out.println("Proyecto #" + idProyecto + " [" + estadoP + "]");
        cliente.mostrarcliente();
        servicio.mostrarServicio();
        System.out.println("Total: $" + costoTotalP + " | Pagado: $" + totalPagadoP);
    }
}