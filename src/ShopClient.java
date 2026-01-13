public class ShopClient extends Server {

    public ShopClient(String pServerIP, int pServerPort){
        super(pServerIP, pServerPort);
    }
    public processMessage(String pMessage){
        String[] nachrichtTeil = p.Message.split(":");
        if(nachrichtTeil[0].equals("TSHIRT"))
        {
            this.send(pClientIP, pClienPort, "Die Groesse ist" +
                    nachrichtTeil[1] + ",die Farbe ist" +
                    nachrichtTeil[2] + "und es kostet 19,99 Euro! Bitte bestätigen Sie die Bestellung.");
        }
        else if (nachrichtTeil[0].equals("BESTAETIGUNG"))
        {
            if(nachrichtTeil[1].equals("ja"))
            {
                this.send(pClientIP, pClientPort, "Vielen Dank für Ihre Bestellung.");
                closeConnection(pClientIP, pClientPort);
            }
            else if (nachrichtTeil[1].equals("nein"))
                {
                    closeConnection(pClientIP, pCLientPort);
                }
            else
            {
                this.send(pClientIP, pClientPort, "Bitte geben Sie ja oder nein ein.");
            }
        }

    }

    public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
        this.send("TSHIRT:"+ pGroesse+ ":" +pFarbe);
    }

    public void bestaetigen(){


    }

    public void abmelden(){

    }

}
