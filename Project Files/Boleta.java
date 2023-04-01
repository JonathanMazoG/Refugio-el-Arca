

public class Boleta {
    private Plan plan;
    private Cliente cliente;
    private String fecha;
    private double porcentajeDescuento ;
    private double precioF;
    
    

    
    
    
    public Boleta(Plan plan, Cliente cliente, String fecha, double porcentajeDescuento, double precioF) {
        this.plan = plan;
        this.cliente = cliente;
        this.fecha = fecha;
        this.porcentajeDescuento = porcentajeDescuento;
        this.precioF = precioF;
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
        else{ 
            porcentajeDescuento = 0.0;
        }
        return precioF;
    }


    @Override
    public String toString() {
        return "Boleta [cliente=" + cliente + ", precioF=" + precioF + ", plan=" + plan + ", fecha=" + fecha
                + ", porcentajeDescuento=" + porcentajeDescuento + "]";
    }

  

    
}