import com.itextpdf.io.image.ImageData; 
import com.itextpdf.io.image.ImageDataFactory; 

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Image; 

import com.itextpdf.text.Paragraph.*;

import com.itextpdf.layout.element.Cell; 
import com.itextpdf.layout.element.Table;

public class ReporteDeVentas{  

public public static void addTitle(Document layoutDocument)()
{
    layoutDocument.add(new Paragraph("RETAIL INVOICE").setBold().setUnderline().setTextAlignment(TextAlignment.CENTER)); {
    
  }
}
public static void CrearLogo(){  
    String logoRefugio = "logo Refugio el Arca.jpg";       
    ImageData logo = ImageDataFactory.create(logoRefugio); 
    Image image = new Image(logo); 
   }
public static void addCustomerReference(Document layoutDocument) ()
{
    layoutDocument.add(new Paragraph("Refugio de Animales el Arca").setTextAlignment(TextAlignment.LEFT).setMultipliedLeading(0.2f));
    layoutDocument.add(new Paragraph("Valle de San Nicolas Rionegro Antioquia Colombia").setMultipliedLeading(.2f));
    layoutDocument.add(new Paragraph("Pueden escribirnos al correo jonathan.mazog@udea.edu.co o tambien a asirley.hoyos@udea.edu.co").setMultipliedLeading(.2f));
}

public void addTable(Document layoutDocument, ArrayList<Boleta> boleta)
{
    Table table = new Table(UnitValue.createPointArray(new float[]{60f, 180f, 50f, 80f, 110f}));

    // headers
    table.addCell(new Paragraph("Plan.").setBold());
    table.addCell(new Paragraph("Cliente").setBold());
    table.addCell(new Paragraph("fecha").setBold());
    table.addCell(new Paragraph("Porcentaje de descuento").setBold());
    table.addCell(new Paragraph("Precio final.").setBold());

    // items
    for(Boleta a : boleta)
    {
        table.addCell(new Paragraph(a.getPlan().getDescription()+""));
        table.addCell(new Paragraph(a.getCliente().getName()));
        table.addCell(new Paragraph(a.getFecha()+""));
        table.addCell(new Paragraph(a.getPorcentajeDescuento()));
        table.addCell(new Paragraph((a.getPrecio())+""));
    }  
    layoutDocument.add(table); 
 }

}