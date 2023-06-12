import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            Device device = new DeviceImpl("Device1", "Mobile", 1234);

            // Export the remote object
            Device stub = (Device) UnicastRemoteObject.exportObject(device, 0);

            // Create the RMI registry
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object's stub in the registry
            registry.rebind("Device", stub);

            System.out.println("RMI Server is running...");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}