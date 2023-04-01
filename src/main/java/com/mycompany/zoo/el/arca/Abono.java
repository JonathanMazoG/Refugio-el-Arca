public class Abono extends Plan{
private double plannedprice;
private double partialpayment;
private double Totalcost;



public Abono(int numberOfSlots, String description, String tipoAnimal, double precio, double plannedprice,
        double partialpayment, double totalcost) {
    super(numberOfSlots, description, tipoAnimal, precio);
    this.plannedprice = plannedprice;
    this.partialpayment = partialpayment;
    Totalcost = totalcost;
}



public double getPlannedprice() {
    return plannedprice;
}



public void setPlannedprice(double plannedprice) {
    this.plannedprice = plannedprice;
}



public double getPartialpayment() {
    return partialpayment;
}



public void setPartialpayment(double partialpayment) {
    this.partialpayment = partialpayment;
}



public double getTotalcost() {
    return Totalcost;
}

public  double calcularCosto(){ 
  Totalcost = plannedprice - partialpayment;
  return Totalcost;
}




public void setTotalcost(double totalcost) {
    Totalcost = totalcost;
}



}