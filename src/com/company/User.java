package com.company;

import java.net.Socket;
import java.net.SocketAddress;

public class User {
    String id;
    SocketAddress socketAddress;

    User(String id, SocketAddress socketAddress){
        this.id = id;
        this.socketAddress = socketAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SocketAddress getSocketAddress() {
        return socketAddress;
    }

    public void setSocketAddress(SocketAddress socketAddress) {
        this.socketAddress = socketAddress;
    }


}
