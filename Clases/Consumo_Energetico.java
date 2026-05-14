public class Consumo_Energetico {
    private double voltaje;
    private double corriente;
    private double horasUso;

    public Consumo_Energetico(double voltaje, double corriente, double horasUso) {
        this.voltaje = voltaje;
        this.corriente = corriente;
        this.horasUso = horasUso;
    }

    public double calcularConsumo() {
        return (voltaje * corriente * horasUso) / 1000;
    }

    public void mostrarconsumo() {
        System.out.println("Consumo calculado: " + calcularConsumo() + " kWh");
    }
}