class Persona {
    private final int edad;
    private final String nombre;
    private final String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    private final double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private final double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(30, "Juan", "555-1234", 5000.0);
        System.out.println("Cliente: " + cliente1.getNombre() + ", " + cliente1.getEdad() + " años, teléfono: " + cliente1.getTelefono() + ", crédito: " + cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador(25, "María", "555-5678", 20000.0);
        System.out.println("Trabajador: " + trabajador1.getNombre() + ", " + trabajador1.getEdad() + " años, teléfono: " + trabajador1.getTelefono() + ", salario: " + trabajador1.getSalario());
    }
}