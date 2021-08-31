package io.github.jferrus.ocrparafechas;

import java.io.File;

import net.sourceforge.tess4j.*;

public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.getImgText("imagenes/cadu3.jpg"));
    }
    
    public String getImgText(String imageLocation) {
    	
    	ITesseract instance = new Tesseract();
        
        try {
        	instance.setLanguage("eng");
        	instance.setTessVariable("tessedit_char_whitelist", " /0123456789");
        	String imgText = instance.doOCR(new File(imageLocation));
        	
        	imgText = imgText.replace("\n", "");
        	imgText = imgText.replace(" ", "");
        	
        	return imgText;
        } catch (TesseractException e) {
        	e.getMessage();
        	return "Error leyendo la imagen";
        }
    }
}
