import interfaces.BillingService;
import objects.User;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class BillingClient {

    public BillingClient() {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.0.14", 8101);
            BillingService bs = (BillingService) registry.lookup("BillingService");

            for (int i = 0; i < 100; i++) {
                addUser(bs);
            }
            getUser(bs);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            System.err.println("NotBoundException : " +  e.getMessage());
        }
    }

    private void getUser(BillingService bs) throws RemoteException {
        User u = bs.getUser(new User(53, null));
        System.out.println(u.getId());
    }

    private void addUser(BillingService bs) throws RemoteException {
        bs.addUser(new User());
    }

    public static void main(String[] args) {
        new BillingClient();
        System.exit(0);
    }
}
