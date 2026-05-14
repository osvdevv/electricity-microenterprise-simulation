public class Servicio {
    private int idServicio;
    private String nombreS;
    private double costoBase;
    private double duracionEstimada;

    public Servicio(int idServicio, String nombreS, double costoBase, double duracionEstimada) {
        this.idServicio = idServicio;
        this.nombreS = nombreS;
        this.costoBase = costoBase;
        this.duracionEstimada = duracionEstimada;
    }

    public double obtenercostobase() { return costoBase; }

    public void mostrarServicio() {
        System.out.println("Servicio [ID: " + idServicio + "] " + nombreS + " | Costo Base: $" + costoBase + " | Duración est.: " + duracionEstimada + " hrs");
    }
}