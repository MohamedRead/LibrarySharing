/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.*;

/**
 *
 * @author ALKODS
 */
public interface HelloInterface extends Remote{
    
    public String say() throws RemoteException;
    
}
