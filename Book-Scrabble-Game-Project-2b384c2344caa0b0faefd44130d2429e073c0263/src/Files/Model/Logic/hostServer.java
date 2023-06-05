package Files.Model.Logic;

import java.net.Socket;

public class hostServer {
    MyServer myServer;
    Socket socket;
    BookScrabbleHandler bookScrabbleHandler;
    int port;
    volatile boolean stop;
    public hostServer(int port,BookScrabbleHandler bookScrabbleHandler){
        this.port = 6400;
        this.bookScrabbleHandler = bookScrabbleHandler;
        this.stop = false;

    }

}
