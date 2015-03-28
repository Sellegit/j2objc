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
@Library("CoreTelephony/CTCall.h")
public class CTCallState 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateDialing")
    public static native NSString DialingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateIncoming")
    public static native NSString IncomingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateConnected")
    public static native NSString ConnectedValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("CTCallStateDisconnected")
    public static native NSString DisconnectedValue();

}
