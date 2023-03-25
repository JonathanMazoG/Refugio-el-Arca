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
            documento.add(paragraph);

         String texto1 = "Valle de San Nicolas Rionegro Antioquia Colombia";
            Paragraph paragraph = new Paragraph(texto1);
            documento.add(paragraph);

             String texto2 = "Pueden escribirnos al correo jonathan.mazog@udea.edu.co o tambien a asirley.hoyos@udea.edu.co ";
            Paragraph paragraph = new Paragraph(texto2);
            documento.add(paragraph);
    }

         

      
      

    }
}
