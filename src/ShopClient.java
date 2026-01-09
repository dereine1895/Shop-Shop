public class ShopClient {

    public ShopClient(String pServerIP, int pServerPort){
        super(pServerIP, pServerPort);
    }

    public processMessage(String pMessage){

    }

    public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
        this.send("TSHIRT:"+ pGroesse+ ":" +pFarbe);
    }

    public void bestaetigen(){


    }

    public void abmelden(){

    }

}
