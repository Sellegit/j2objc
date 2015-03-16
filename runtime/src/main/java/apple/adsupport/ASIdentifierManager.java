package apple.adsupport;


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
 * @since Available in iOS 6.0 and later.
 */

@Library("AdSupport/AdSupport.h") @Mapping("ASIdentifierManager")
public class ASIdentifierManager 
    extends NSObject 
     {

    
    
    public ASIdentifierManager() {}
    
    
    @Mapping("advertisingIdentifier")
    public native NSUUID getAdvertisingIdentifier();
    @Mapping("isAdvertisingTrackingEnabled")
    public native boolean isAdvertisingTrackingEnabled();
    
    
    
    @Mapping("sharedManager")
    public static native ASIdentifierManager getSharedManager();
    
}
