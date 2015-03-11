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

@Library("HealthKit") @Mapping("HKObject")
public class HKObject 
    extends NSObject 
     {

    
    
    public HKObject() {}
    
    
    @Mapping("UUID")
    public native NSUUID getUUID();
    @Mapping("source")
    public native HKSource getSource();
    @Mapping("metadata")
    public native NSDictionary<?, ?> getMetadata();
    
    
    
    
    
}
