// Implementation of the remote interface
import java.rmi.Remote;
import java.rmi.RemoteException;

public class DeviceImpl implements Device {
    private String deviceName;
    private String deviceType;
    private int deviceID;

    public DeviceImpl(String deviceName, String deviceType, int deviceID) {
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceID = deviceID;
    }

    @Override
    public String getDeviceName() throws RemoteException {
        return deviceName;
    }

    @Override
    public String getDeviceType() throws RemoteException {
        return deviceType;
    }

    @Override
    public int getDeviceID() throws RemoteException {
        return deviceID;
    }
}