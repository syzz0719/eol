package com.ht.comm;


import javax.swing.JTextField;

public class NetPortListenerEx extends NetPortListener {

    public NetPortListenerEx(int port , JTextField codeField,JTextField qcField) {
        super(port,codeField,qcField);
    }
}
