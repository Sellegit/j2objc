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

@Library("Metal") @Mapping("MTLCommandEncoder")
public interface MTLCommandEncoder 
    extends NSObjectProtocol {

    
    
    @Mapping("device")
    MTLDevice getDevice();
    @Mapping("label")
    String getLabel();
    void setLabel(String v);
    
    
    @Mapping("endEncoding")
    void endEncoding();
    @Mapping("insertDebugSignpost:")
    void insertDebugSignpost(String string);
    @Mapping("pushDebugGroup:")
    void pushDebugGroup(String string);
    @Mapping("popDebugGroup")
    void popDebugGroup();
    
    /*<adapter>*/
    /*</adapter>*/
}
