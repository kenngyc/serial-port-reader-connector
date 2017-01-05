package org.mule.modules.serialportreader.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import com.fazecast.jSerialComm.SerialPort;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {
	
    /*********
     * Configure the Serial Port Device. i.e. /dev/ttyUSB0
     */
    @Configurable
    @FriendlyName("Serial device")
    @Default("/dev/ttyUSB0")
    private String serialPortDevice;

    /**
     * Set serial port device
     *
     * @param serial port device
     */
    public void setSerialPortDevice(String serialPortDevice) {
        this.serialPortDevice = serialPortDevice;
    }

    /**
     * Get serial port device
     */
    public String getSerialPortDevice() {
        return this.serialPortDevice;
    }
    
    /*********
     * Configure the Serial Port Baud Rate. i.e. 9600
     */
    @Configurable
    @FriendlyName("Baud Rate")
    @Default("9600")
    private int serialPortBaudRate;

    /**
     * Set serial port baud rate
     *
     * @param serial port baud rate
     */
    public void setSerialPortBaudRate(int serialPortBaudRate) {
        this.serialPortBaudRate = serialPortBaudRate;
    }

    /**
     * Get serial port baud rate
     */
    public int getSerialPortBaudRate() {
        return this.serialPortBaudRate;
    }
    
    /*********
     * Configure the Serial Data Bits. i.e. 8
     */
    @Configurable
    @FriendlyName("Data bits")
    @Default("8")
    private int serialPortDataBits;

    /**
     * Set serial port data bits
     *
     * @param serial port data bits
     */
    public void setSerialPortDataBits(int serialPortDataBits) {
        this.serialPortDataBits = serialPortDataBits;
    }

    /**
     * Get serial port data bits
     */
    public int getSerialPortDataBits() {
        return this.serialPortDataBits;
    }
    
    /*********
     * Configure the Serial Stop Bits
     */
    @Configurable
    @FriendlyName("Stop bits")
    @Default("ONE_STOP_BIT")
    private StopBits serialPortStopBits;

    /**
     * Set serial port stop bits
     *
     * @param serial port stop bits
     */
    public void setSerialPortStopBits(StopBits serialPortStopBits) {
        this.serialPortStopBits = serialPortStopBits;
    }

    /**
     * Get serial port stop bits
     */
    public int getSerialPortStopBits() {
        return this.serialPortStopBits.stopBits;
    }
    
    /**
     * Configure the Serial Port Parity
     */
    @Configurable
    @FriendlyName("Parity")
    @Default("NO_PARITY")
    private Parity serialPortParity;

    /**
     * Set serial port parity
     *
     * @param serial port parity
     */
    public void setSerialPortParity(Parity serialPortParity) {
        this.serialPortParity = serialPortParity;
    }

    /**
     * Get serial port parity
     */
    public int getSerialPortParity() {
        return this.serialPortParity.parity;
    }
    
    public enum StopBits {
        ONE_STOP_BIT(SerialPort.ONE_STOP_BIT),
        ONE_POINT_FIVE_STOP_BITS(SerialPort.ONE_POINT_FIVE_STOP_BITS),
        TWO_STOP_BITS(SerialPort.TWO_STOP_BITS);
        
        private int stopBits;

        StopBits(int stopBits) {
            this.stopBits = stopBits;
        }

        public int stopBits() {
            return stopBits;
        }
    }
    
    public enum Parity {
    	NO_PARITY(SerialPort.NO_PARITY),
    	ODD_PARITY(SerialPort.ODD_PARITY),
        EVEN_PARITY(SerialPort.EVEN_PARITY),
        MARK_PARITY(SerialPort.MARK_PARITY),
        SPACE_PARITY(SerialPort.SPACE_PARITY);
        
        private int parity;

        Parity(int parity) {
            this.parity = parity;
        }

        public int parity() {
            return parity;
        }
    }
    
    
}