package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class cliente extends javax.swing.JFrame {
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;

    public cliente() {
        initComponents();
    }
}
