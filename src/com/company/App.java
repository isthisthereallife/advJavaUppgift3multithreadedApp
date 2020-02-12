package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final App instance = new App();
    static List<User> users;

    private App() {
        users = new ArrayList<>();
        Thread klient = new Thread(NetworkClient.getInstance());
        klient.start();
        Thread server = new Thread(NetworkServer.getInstance());
        server.start();

        Scanner scan = new Scanner(System.in);
        do {
            String msgToSend = scan.nextLine();
            NetworkClient.getInstance().sendMsgToServer(msgToSend);
        } while (true);

    }

    public static App singleton() {
        return instance;
    }

}
