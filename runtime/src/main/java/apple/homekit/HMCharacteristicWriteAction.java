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

@Library("HomeKit/HomeKit.h") @Mapping("HMCharacteristicWriteAction")
public class HMCharacteristicWriteAction 
    extends HMAction 
     {

    
    
    public HMCharacteristicWriteAction() {}
    @Mapping("initWithCharacteristic:targetValue:")
    public HMCharacteristicWriteAction(HMCharacteristic characteristic, Object targetValue) { }
    
    
    @Mapping("characteristic")
    public native HMCharacteristic getCharacteristic();
    @Mapping("targetValue")
    public native Object getTargetValue();
    
    
    
    @Mapping("updateTargetValue:completionHandler:")
    public native void updateTargetValue(Object targetValue, @Block VoidBlock1<NSError> completion);
    
}
