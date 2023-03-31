import com.itextpdf.io.image.ImageData; 
import com.itextpdf.io.image.ImageDataFactory; 

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Image; 

import com.itextpdf.text.Paragraph.*;

import com.itextpdf.layout.element.Cell; 
import com.itextpdf.layout.element.Table;

public class ReporteDeVentas {

    public static void CrearPdf()throws Exception {
        String destiny = "informe de ventas el Arca.pdf";       
        PdfWriter writer = new PdfWriter(destiny);

        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
    }
    public static void CrearLogo(){  
        String logoRefugio = "logo Refugio el Arca.jpg";       
        ImageData logo = ImageDataFactory.create(logoRefugio); 
        Image image = new Image(logo); 
        
        document.add(image);              
        System.out.println("El logo se creo "); 
    }
    public static void Encabezados(){  
         String texto = "Refugio de Animales el Arca";
            Paragraph paragraph = new Paragraph(texto);
            document.add(paragraph);

         String texto1 = "Valle de San Nicolas Rionegro Antioquia Colombia";
            Paragraph paragraph = new Paragraph(texto1);
            document.add(paragraph);

             String texto2 = "Pueden escribirnos al correo jonathan.mazog@udea.edu.co o tambien a asirley.hoyos@udea.edu.co ";
            Paragraph paragraph = new Paragraph(texto2);
            document.add(paragraph);
    }

    public static void InsertarTabla (){
      //primera tabla
     float [] pointColumnWidths1 = {150f, 150f, 150f, 150f, 150f, 150f};       
      Table table = new Table(pointColumnWidths1);                             
            
      Cell cell1 = new Cell();       
      cell1.add("Plan");       
      table.addCell(cell1);             
      
      Cell cell2 = new Cell();       
      cell2.add("Valor");       
      table.addCell(cell2); 
      
      Cell cell3 = new Cell();       
      cell3.add("Cantidad");       
      table.addCell(cell3);             
      
      Cell cell4 = new Cell();       
      cell4.add("Valor venta");       
      table.addCell(cell4);        
      
      // tabla anidada
      float [] pointColumnWidths2 = {150f, 150f};       
      Table table2 = new Table(pointColumnWidths2); 

      Cell cellt2_1 = new Cell();       
      cellt2_1.add("porcentaje Descuento");       
      table2.addCell(cellt2_1);
      
      Cell cellt2_2 = new Cell();       
      cellt2_2.add ("Valor Descuento");     
      table2.addCell(cellt2_2); 

     Cell cell5 = new Cell();       
      cell5.add(table2);       
      table.addCell(cell5); 
      
     Cell cell6 = new Cell();       
      cell6.add("Total");       
      table.addCell(cell6);
    }

  }
         

      
      

    

