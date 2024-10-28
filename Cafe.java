/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups; 

    public Cafe(String name, String address, int nFloors, int nCO, int nSP, int nCr,int nCu) {
        super(name,address,nFloors);
        nCoffeeOunces=nCO;
        nSugarPackets=nSP;
        nCreams=nCr;
        nCups=nCu;
        System.out.println("You have built a cafe: ☕");
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        int restockCu=0;
        int restockCO=0;
        int restockSP=0;
        int restockCr=0;
       
        if ((this.nCups>0) && (size<=this.nCoffeeOunces)&& (nSugarPackets<=this.nSugarPackets)&&(nCreams<=this.nCreams)){
        this.nCups--;
        this.nCoffeeOunces=this.nCoffeeOunces-size;
        this.nSugarPackets=this.nSugarPackets-nSugarPackets;
        this.nCreams=this.nCreams-nCreams;
       }else{
        if(this.nCups==0){
        restockCu=25;
        }
        if(this.nCoffeeOunces<size){
            restockCO=10*size;
        }
        if(this.nSugarPackets<nSugarPackets){
            restockSP=10*nSugarPackets;
        }
        if(this.nCreams<nCreams){
            restockCr=10*nCreams;
        }
        restock(restockCO,restockSP,restockCr,restockCu);

        this.nCups--;
        this.nCoffeeOunces=this.nCoffeeOunces-size;
        this.nSugarPackets=this.nSugarPackets-nSugarPackets;
        this.nCreams=this.nCreams-nCreams;


       }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces=this.nCoffeeOunces+nCoffeeOunces;
        this.nSugarPackets=this.nSugarPackets+nSugarPackets;
        this.nCreams=this.nCreams+nCreams;
        this.nCups=this.nCups+nCups;
    }
    public static void main(String[] args) {
        Cafe myCafe= new Cafe("Mark's", "IDK",6,12,4,4,2);
        myCafe.sellCoffee(12,2,1);
        myCafe.sellCoffee(12,2,1);

    }
    
}
