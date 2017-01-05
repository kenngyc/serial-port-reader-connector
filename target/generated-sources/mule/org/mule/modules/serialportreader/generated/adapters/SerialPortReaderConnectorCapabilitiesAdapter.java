
package org.mule.modules.serialportreader.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.serialportreader.SerialPortReaderConnector;


/**
 * A <code>SerialPortReaderConnectorCapabilitiesAdapter</code> is a wrapper around {@link SerialPortReaderConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-01-05T09:20:39+08:00", comments = "Build UNNAMED.2793.f49b6c7")
public class SerialPortReaderConnectorCapabilitiesAdapter
    extends SerialPortReaderConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
