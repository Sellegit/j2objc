package apple.healthkit;


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

@Library("HealthKit") @Mapping("HKSource")
public class HKSource 
    extends NSObject 
    implements NSCopying {

    
    
    public HKSource() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("bundleIdentifier")
    public native String getBundleIdentifier();
    
    
    
    @Mapping("defaultSource")
    public static native HKSource getDefaultSource();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
