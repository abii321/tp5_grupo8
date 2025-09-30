package ar.edu.unju.escmi.tp5.dominio;

public class Cliente {
    protected String nombre;
    protected String apellido;
    protected String telefono;

    public Cliente(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // Método para que el cliente realice la compra
    public Factura comprar(Producto producto, int cantidad) {
        Factura factura = new Factura(this); // se crea factura para este cliente
        factura.agregarDetalle(producto, cantidad);
        return factura;
    }

    // Por defecto, no aplica descuento
    public double calcularDesc(double total) {
        return total;
    }
}

// =============================
// Cliente Mayorista
// =============================
class ClienteMayorista extends Cliente {
    private int codCliente;

    public ClienteMayorista(String nombre, String apellido, String telefono, int codCliente) {
        super(nombre, apellido, telefono);
        this.codCliente = codCliente;
    }

    public double calcularPrecioMayorista(Producto prod) {
        return prod.getPrecioParaCliente(true);
    }
}

// =============================
// Cliente Minorista
// =============================
class ClienteMinorista extends Cliente {
    private int dni;
    private boolean tienePAMI;

    public ClienteMinorista(String nombre, String apellido, String telefono, int dni, boolean tienePAMI) {
        super(nombre, apellido, telefono);
        this.dni = dni;
        this.tienePAMI = tienePAMI;
    }

    @Override
    public double calcularDesc(double total) {
        if (tienePAMI) {
            return total * 0.90; // 10% descuento
        }
        return total;
    }
}
