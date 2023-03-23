import java.util.*;

public class Boleta {
    private Cliente cliente;
    private double precioF;
    private Plan plan;
    private String fecha;

    public Boleta(Cliente cliente, double precioF, Plan plan, String fecha) {
        this.cliente = cliente;
        this.precioF = precioF;
        this.plan = plan;
        this.fecha = fecha;
    }

    public Boleta() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecio() {
        return precioF;
    }

    public void setPrecio(double precio) {
        this.precioF = precioF;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double aplicarDescuento(Cliente cliente, Plan plan) {
        double precio = plan.getPrecio();
        String tipoCliente = cliente.getTipo();

        if (tipoCliente.equals("frecuente")) {
            precio = precio - (precio * 0.2);
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Boleta [cliente=" + cliente + ", precioF=" + precioF + ", plan=" + plan + ", fecha=" + fecha + "]";
    }

    
}