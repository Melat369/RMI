import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote interface for Device
public interface Device extends Remote {
    String getDeviceName() throws RemoteException;
    String getDeviceType() throws RemoteException;
    int getDeviceID() throws RemoteException;
}