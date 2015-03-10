package apple.metal;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal") @Mapping("MTLResource")
public interface MTLResource 
    extends NSObjectProtocol {

    
    
    @Mapping("label")
    String getLabel();
    void setLabel(String v);
    @Mapping("device")
    MTLDevice getDevice();
    @Mapping("cpuCacheMode")
    @Representing("MTLCPUCacheMode") @MachineSizedUInt long getCpuCacheMode();
    
    
    @Mapping("setPurgeableState:")
    @Representing("MTLPurgeableState") @MachineSizedUInt long setPurgeableState(@Representing("MTLPurgeableState") @MachineSizedUInt long state);
    
    /*<adapter>*/
    /*</adapter>*/
}
