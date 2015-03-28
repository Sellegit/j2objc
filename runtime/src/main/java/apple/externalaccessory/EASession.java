package apple.externalaccessory;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;
import apple.dispatch.*;


/**
 * @since Available in iOS 3.0 and later.
 */
@Library("ExternalAccessory/ExternalAccessory.h") @Mapping("EASession")
public class EASession 
    extends NSObject 
     {

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("initWithAccessory:forProtocol:")
    public EASession(EAAccessory accessory, String protocolString) { }
    @Mapping("init")
    public EASession() { }

    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("accessory")
    public native EAAccessory getAccessory();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("protocolString")
    public native String getProtocolString();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("inputStream")
    public native NSInputStream getInputStream();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("outputStream")
    public native NSOutputStream getOutputStream();

    
    


}
