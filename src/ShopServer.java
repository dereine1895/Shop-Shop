public class ShopServer extends Server {

    public ShopServer(int pPortnummer){

    }

    public void processNewConnection(String pClientIP, int pClientPort){
        this.send(pClientIP, pClientPort, "Willkommen! Wählen Sie eine Größe und eine Farbe für Ihr T-Shirt.");

    }

    public void processMessage(String pClientIP, int pClientport, String pMessage){

    }

    public void processClosedConnection(String pClientIP, int pClientport){

    }










}
