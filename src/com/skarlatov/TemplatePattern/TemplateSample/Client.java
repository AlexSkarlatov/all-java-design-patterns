package com.skarlatov.TemplatePattern.TemplateSample;

public class Client {
    public static void main(String[] args){
        HouseTemplate houseType = new WoodenHouse("wood");
        //house tempalte method
        houseType.buildHouse();

        System.out.println("***************");

        houseType = new GlassHouse("glass");
        houseType.buildHouse();
    }
}
