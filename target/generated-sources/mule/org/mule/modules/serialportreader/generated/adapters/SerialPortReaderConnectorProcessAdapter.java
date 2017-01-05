
package org.mule.modules.serialportreader.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.serialportreader.SerialPortReaderConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>SerialPortReaderConnectorProcessAdapter</code> is a wrapper around {@link SerialPortReaderConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-01-05T09:20:39+08:00", comments = "Build UNNAMED.2793.f49b6c7")
public class SerialPortReaderConnectorProcessAdapter
    extends SerialPortReaderConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<SerialPortReaderConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, SerialPortReaderConnectorCapabilitiesAdapter> getProcessTemplate() {
        final SerialPortReaderConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,SerialPortReaderConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, SerialPortReaderConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, SerialPortReaderConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
