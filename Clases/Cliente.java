public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(int id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void mostrarcliente() {
        System.out.println("Cliente [ID: " + id + ", Nombre: " + nombre + ", Dir: " + direccion + ", Tel: " + telefono + "]");
    }

    public void actualizardatos(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() { return id; }
}