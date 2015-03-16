package apple.coretelephony;


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
 * @since Available in iOS 4.0 and later.
 */

@Library("CoreTelephony/CoreTelephony.h") @Mapping("CTCallCenter")
public class CTCallCenter 
    extends NSObject 
     {

    
    
    public CTCallCenter() {}
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("currentCalls")
    public native NSSet<CTCall> getCurrentCalls();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("callEventHandler")
    public native @Block VoidBlock1<CTCall> getCallEventHandler();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setCallEventHandler:")
    public native void setCallEventHandler(@Block VoidBlock1<CTCall> v);
    
    
    
    
    
}
