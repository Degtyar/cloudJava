package me.degtyar.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler {

    private Socket socket;
    private Server server;
    private DataOutputStream out;
    private DataInputStream in;
    private String nick = null;

    public String getNick() {
        return nick;
    }

    public ClientHandler(Server server, Socket socket) {

    }
}
