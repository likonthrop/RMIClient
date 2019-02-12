package interfaces;

import objects.User;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BillingService extends Remote {

    public User getUser(User user) throws RemoteException;
    public void addUser(User user) throws RemoteException;

}
