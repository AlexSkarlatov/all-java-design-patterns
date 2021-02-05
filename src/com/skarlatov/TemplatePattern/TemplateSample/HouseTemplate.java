package com.skarlatov.TemplatePattern.TemplateSample;


/*
my abstract template that cointains the mtemplate method and control stuff inhjeritacne
 */
public abstract class HouseTemplate {
    private String type;
    public HouseTemplate(String type){
        this.type = type;
        System.out.println("building house of type" + type);
    }
    //template method,a final so subclasses cannoty override it
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is builtr");
    }
    private void buildWindows(){
        System.out.println("building glass windows");

    }
    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation(){
        System.out.println("building foundation with cement, iron rods and sand");
    }
}

class WoodenHouse extends HouseTemplate{
    public WoodenHouse(String type) {
        super(type);
    }
    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");

    }
    @Override
    public void buildPillars() {
        System.out.println("Building pillars with wooden coating");
    }
}


class GlassHouse extends HouseTemplate{
    public GlassHouse(String type) {
        super(type);
    }
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");

    }
    @Override
    public void buildPillars() {
        System.out.println("Building pillars with a glassy finish");
    }
}