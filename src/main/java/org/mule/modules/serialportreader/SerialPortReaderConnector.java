package org.mule.modules.serialportreader;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.modules.serialportreader.config.ConnectorConfig;

import com.fazecast.jSerialComm.SerialPort;

@Connector(name="serial-port-reader", friendlyName="Serial Port Reader")
public class SerialPortReaderConnector {

    @Config
    ConnectorConfig config;

    /**
     * Read a single data feed from the serial Port
     *
     * @return Get reading from the Serial Port
     */
	@Processor(friendlyName = "Read Serial Data")
    public byte[] readSerialData() {
    	SerialPort comPort = SerialPort.getCommPort(config.getSerialPortDevice());
		comPort.setComPortParameters(config.getSerialPortBaudRate(), config.getSerialPortDataBits(), config.getSerialPortStopBits(), config.getSerialPortParity());
		byte[] readBuffer = new byte[9];
		
		try {
			comPort.openPort();
			comPort.readBytes(readBuffer, readBuffer.length);			
		} catch (Exception e) { e.printStackTrace(); }
		comPort.closePort();
		return readBuffer;
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }   
}