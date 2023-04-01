package com.mycompany.zoo.el.arca;

import java.io.IOException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;

public class ReporteDeVentas {

  public static void crearPdf() throws IOException {
    String destino = "informe de ventas el Arca.pdf";
    PdfWriter writer = new PdfWriter(destino);
    PdfDocument pdf = new PdfDocument(writer);
    Document document = new Document(pdf);

    crearLogo(document);
    encabezados(document);
    insertarTabla(document);

    document.close();
    System.out.println("El PDF se ha creado correctamente");
  }

  public static void crearLogo(Document document) throws IOException {
    String logoRefugio = "logo Refugio el Arca.jpg";
    ImageData logo = ImageDataFactory.create(logoRefugio);
    Image image = new Image(logo);

    document.add(image);
    System.out.println("El logo se ha creado");
  }

  public static void encabezados(Document document) {
    String texto = "Refugio de Animales el Arca";
    Paragraph paragraph1 = new Paragraph(texto);
    document.add(paragraph1);

    String texto1 = "Valle de San Nicolas Rionegro Antioquia Colombia";
    Paragraph paragraph2 = new Paragraph(texto1);
    document.add(paragraph2);

    String texto2 = "Pueden escribirnos al correo jonathan.mazog@udea.edu.co o tambien a asirley.hoyos@udea.edu.co ";
    Paragraph paragraph3 = new Paragraph(texto2);
    document.add(paragraph3);
  }

  public static void insertarTabla(Document document) {
    // primera tabla
    float[] pointColumnWidths1 = { 150f, 150f, 150f, 150f, 150f, 150f };
    Table table = new Table(pointColumnWidths1);

    Cell cell1 = new Cell();
    Paragraph paragraph1 = new Paragraph("Plan");
    cell1.add(paragraph1);
    table.addCell(cell1);

    Cell cell2 = new Cell();
    Paragraph paragraph2 = new Paragraph("Valor");
    cell2.add(paragraph2);
    table.addCell(cell2);

    Cell cell3 = new Cell();
    Paragraph paragraph3 = new Paragraph("Cantidad");
    cell3.add(paragraph3);
    table.addCell(cell3);

    Cell cell4 = new Cell();
    Paragraph paragraph4 = new Paragraph("Valor venta");
    cell4.add(paragraph4);
    table.addCell(cell4);

    // tabla anidada
    float[] pointColumnWidths2 = { 150f, 150f };
    Table table2 = new Table(pointColumnWidths2);

    Cell cellt2_1 = new Cell();
    Paragraph paragraph5 = new Paragraph("porcentaje Descuento");
    cellt2_1.add(paragraph5);
    table2.addCell(cellt2_1);

    Cell cellt2_2 = new Cell();
    Paragraph paragraph6 = new Paragraph("Valor Descuento");
    cellt2_2.add(paragraph6);
    table2.addCell(cellt2_2);

    Cell cell5 = new Cell();
    cell5.add(table2);
    table.addCell(cell5);

    Cell cell6 = new Cell();
    Paragraph paragraph7 = new Paragraph("Total");
    cell6.add(paragraph7);
    table.addCell(cell6);

    document.add(table);
  }
}