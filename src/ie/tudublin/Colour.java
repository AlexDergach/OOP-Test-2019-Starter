package ie.tudublin;

import processing.data.TableRow;


public class Colour {

    public int r,g,b, value;
    private String colour;


    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }



    public Colour(int r, int g, int b, int value ,String colour){
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;

        this.colour = colour;
    }

        
    public Colour(TableRow tr)
    {
        this(tr.getInt("r"), tr.getInt("g"), tr.getInt("b"), tr.getInt("value"), tr.getString("colour"));
    }


    @Override
    public String toString() {
        return "Colour [r= " + r + ", g= " + g + ", b= " + b + ", value=" + value + ",colour= " + colour + "]";
    }
    
}
