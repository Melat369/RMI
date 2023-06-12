import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Look up the remote object from the registry
            Device device = (Device) registry.lookup("Device");

            // Invoke remote methods
            System.out.println("Device Name: " + device.getDeviceName());
            System.out.println("Device Type: " + device.getDeviceType());
            System.out.println("Device ID: " + device.getDeviceID());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}