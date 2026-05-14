public class Tecnico {
    private int idTecnico;
    private String nombreT;
    private String especialidad;
    private boolean disponible;

    public Tecnico(int idTecnico, String nombreT, String especialidad) {
        this.idTecnico = idTecnico;
        this.nombreT = nombreT;
        this.especialidad = especialidad;
        this.disponible = true;
    }

    public boolean estadisponible() { return disponible; }
    public void asignar() { this.disponible = false; }
    public void liberar() { this.disponible = true; }

    public void mostrartecnico() {
        System.out.println("Técnico [ID: " + idTecnico + "] " + nombreT + " (" + especialidad + ") - Disponible: " + disponible);
    }
}