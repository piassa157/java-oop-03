package oopjava04;

/**
 *
 * @author Piassa
 */
public class Pencil {
    private String model;
    private float tip;
    private String color;
    protected int charge;
    protected boolean capped;
    
    public Pencil(String model, float tip, String color, int charge){
        this.setModel(model);
        this.setTip(tip);
        this.setColor(color);
        this.setCharge(charge);
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public float getTip(){
        return this.tip;
    }
    
    public void setTip(float tip){
        this.tip = tip;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public int getCharge(){
        return this.charge;
    }
    
    public void setCharge(int charge){
        this.charge = charge;
    }
    
    public boolean getCapped(){
        return this.capped;
    }
    
    public void setCapped(boolean capped){
        this.capped = capped;
    }
        
    protected void cover() {
        this.setCapped(true);
    }
    
    protected void uncap() {
        this.setCapped(false);
    }
    
    public void status(){
        System.out.println("New pencil " + this.model);
        System.out.println("Tip: " + this.tip);
    }
    
}
