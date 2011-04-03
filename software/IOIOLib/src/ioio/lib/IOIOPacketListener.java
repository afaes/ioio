package ioio.lib;

/**
 * Handles packets for processing.
 *
 * @author arshan
 * @author birmiwal
 */
public interface IOIOPacketListener {
    public void handlePacket(IOIOPacket packet);
    public void disconnectNotification();
}