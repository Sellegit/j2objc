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

@Library("CoreTelephony/CTCall.h") @Mapping("CTCall")
public class CTCall 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CTCall() { }
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("callState")
    public native CTCallState getCallState();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("callID")
    public native String getCallID();
    
    
    
    
    
}
