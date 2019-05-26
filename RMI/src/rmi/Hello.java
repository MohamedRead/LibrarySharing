/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author ALKODS
 */
public class Hello extends UnicastRemoteObject implements HelloInterface{

    private String message;
    
    public Hello(String msg) throws RemoteException{
        message = msg;
    }
    @Override
    public String say() throws RemoteException {
        return message;
    }
    
    
    
}
