package ie.tudublin;

import processing.core.PApplet;

public class Resistor {
    public int value;
    UI ui;
    Colour hc;
    Colour tc;
    Colour oc;

    public Resistor(UI ui, int value){
        this.ui = ui;
        this.value = value;
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        hc = ui.findColour(hundreds);
        tc = ui.findColour(tens);
        oc = ui.findColour(ones);
    }

    public void render(float x , float y)
    {
        //Saves the current positions
        ui.pushMatrix();
        //moves everything under this line
        ui.translate(x, y);

        //creatine lines
        ui.stroke(0);
        //(x, y, x of second, y of second)
        ui.line(-100, 00, -50, 0);
        ui.line(-50, 0, -50, -50);
        ui.line(-50, -50, 50, -50);
        
        ui.line(50, -50, 50, 0);
        ui.line(50, 0, 100, 0);
        ui.line(50, 0, 50, 50);
        ui.line(50, 50, -50, 50);
        ui.line(-50, 50, -50, 0);

        // Draw the color bars
        ui.noStroke();
        ui.fill(hc.r, hc.g, hc.b);
        ui.rect(-40, -49, 10, 99);
        
        ui.fill(tc.r, tc.g, tc.b);
        ui.rect(-20, -49, 10, 99);
        
        ui.fill(oc.r, oc.g, oc.b);
        ui.rect(0, -49, 10, 99);

        ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(30);
        ui.text(value, 200, 0);

        //needs to pop the pushed matrix
        ui.popMatrix();

    }

}
