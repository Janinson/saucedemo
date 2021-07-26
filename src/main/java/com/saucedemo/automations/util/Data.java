package com.saucedemo.automations.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Data {
    public String [] getData(){

        String excel = "solucionfuncional/Datos.xlsx";
        String user = null;
        String password = null;

        try {
            FileInputStream file = new FileInputStream(new File(excel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("DatosUsuario");

            Row row;
            Cell cell;

            row = hoja.getRow(1);
            cell = row.getCell(0);
            user = cell.toString();
            cell = row.getCell(1);
            password = cell.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String dataUser[] = { user, password };
        return dataUser;
    }

    public String [] getInfo(){

        String archivoExcel = "solucionfuncional/Datos.xlsx";
        String nombre = null;
        String apellido = null;
        String codigoPostal = null;

        try {
            FileInputStream file = new FileInputStream(new File(archivoExcel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("Informacion");

            Row row;
            Cell cell;

            row = hoja.getRow(1);
            cell = row.getCell(0);
            nombre = cell.toString();
            cell = row.getCell(1);
            apellido = cell.toString();
            cell = row.getCell(2);
            codigoPostal = cell.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String dataUser[] = { nombre, apellido, codigoPostal };
        return dataUser;
    }
}
