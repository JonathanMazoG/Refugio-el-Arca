

public class Boleta {
    private Cliente cliente;
    private double precioF;
    private Plan plan;
    private String fecha;
    private double porcentajeDescuento = 0.2;
    
    

    public Boleta(Cliente cliente, double precioF, Plan plan, String fecha, double porcentajeDescuento) {
        this.cliente = cliente;
        this.precioF = precioF;
        this.plan = plan;
        this.fecha = fecha;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    

    public Boleta() {
    }


    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
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

    public void setPrecio(double precioF) {
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
            precioF = precio - (precio * porcentajeDescuento);
        }
        return precioF;
    }


    @Override
    public String toString() {
        return "Boleta [cliente=" + cliente + ", precioF=" + precioF + ", plan=" + plan + ", fecha=" + fecha
                + ", porcentajeDescuento=" + porcentajeDescuento + "]";
    }

  

    
}