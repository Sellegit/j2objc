package apple.homekit;


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


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("HomeKit/HomeKit.h") @Mapping("HMCharacteristic")
public class HMCharacteristic 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public HMCharacteristic() { }

    
    @Mapping("characteristicType")
    public native HMCharacteristicType getCharacteristicType();
    @Mapping("service")
    public native HMService getService();
    @Mapping("properties")
    public native List<HMCharacteristicProperty> getProperties();
    @Mapping("metadata")
    public native HMCharacteristicMetadata getMetadata();
    @Mapping("value")
    public native Object getValue();
    @Mapping("isNotificationEnabled")
    public native boolean isNotificationEnabled();

    
    
    @Mapping("writeValue:completionHandler:")
    public native void writeValue(Object value, @Block VoidBlock1<NSError> completion);
    @Mapping("readValueWithCompletionHandler:")
    public native void readValue(@Block VoidBlock1<NSError> completion);
    @Mapping("enableNotification:completionHandler:")
    public native void enableNotification(boolean enable, @Block VoidBlock1<NSError> completion);
    @Mapping("updateAuthorizationData:completionHandler:")
    public native void updateAuthorizationData(NSData data, @Block VoidBlock1<NSError> completion);

}
