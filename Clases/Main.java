public class Main {
    public static void main(String[] args) {
        // 1. Inicializamos la empresa 
        Empresa miEmpresa = new Empresa();

        // 2. Registramos datos básicos (Simulación de base de datos) 
        Cliente cliente1 = new Cliente(1, "Luis Osvaldo", "Tlahuelilpan, Centro", "7731234567");
        Servicio instResidencial = new Servicio(101, "Instalación Residencial", 1200.0, 4.5);
        Tecnico tecnico1 = new Tecnico(501, "Ing. Giovany Neri", "Sistemas Eléctricos");

        miEmpresa.agregarcliente(cliente1);
        miEmpresa.agregarservicio(instResidencial);
        miEmpresa.agregartecnico(tecnico1);

        // 3. Creamos un consumo energético para el servicio 
        // Parámetros: Voltaje (127V), Corriente (15A), Horas de uso (5h)
        Consumo_Energetico consumoE = new Consumo_Energetico(127, 15, 5);

        // 4. Creamos el Proyecto integrando todo
        Proyecto proyectoNthebe = new Proyecto(202601, cliente1, instResidencial, tecnico1, consumoE);
        miEmpresa.crearProyecto(proyectoNthebe);

        System.out.println("--- INICIANDO SIMULACIÓN NTHEBE ENERGY ---");

        // 5. Iniciamos el proyecto y calculamos costos 
        proyectoNthebe.iniciarproyecto(); // El técnico cambia a no disponible
        
        // Supongamos que el precio del kWh en la región es de $2.80
        proyectoNthebe.calcularCostoTotal(2.80); 

        // 6. Registramos un pago parcial 
        proyectoNthebe.registrarpago(500.0);

        // 7. Mostramos el avance 
        proyectoNthebe.mostrarresumen();

        // 8. Finalizamos el trabajo 
        proyectoNthebe.finalizarproyecto(); // El técnico se libera
        System.out.println("\n--- TRABAJO FINALIZADO ---");
        tecnico1.mostrartecnico(); // Verificamos que esté libre

        // 9. Revisamos reportes administrativos de la empresa 
        System.out.println("\n--- REVISIÓN ADMINISTRATIVA ---");
        miEmpresa.reportedeudas();
    }
}