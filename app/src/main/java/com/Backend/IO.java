package com.Backend;

import android.content.Context;
import android.content.res.Resources;

import com.Utils.IOUtil;

import java.io.IOException;
import java.net.Socket;

public class IO {
    private Socket socket;

    private String serverIP;

    public IO(Context context){

        try {
            serverIP = IOUtil.getProperty("serverIp", context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //GETTER SETTER

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }
}
