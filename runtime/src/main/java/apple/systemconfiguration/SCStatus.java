package apple.systemconfiguration;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("SystemConfiguration")
public class SCStatus 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCCopyLastError")
    public static native CFError getLastError();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCError")
    public static native SCStatusCode getLastStatus();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCErrorString")
    protected static native Todo getStatusDescription0(int status);
    
}
