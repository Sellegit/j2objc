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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreTelephony")
public class CTCallState 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateDialing")
    protected static native NSString DialingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateIncoming")
    protected static native NSString IncomingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateConnected")
    protected static native NSString ConnectedValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateDisconnected")
    protected static native NSString DisconnectedValue();
    
}
