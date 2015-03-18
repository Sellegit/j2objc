package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFStreamProperty 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFStreamPropertyDataWritten")
    public static native String DataWrittenValue();
    @GlobalConstant("kCFStreamPropertyAppendToFile")
    public static native String AppendToFileValue();
    @GlobalConstant("kCFStreamPropertyFileCurrentOffset")
    public static native String FileCurrentOffsetValue();
    @GlobalConstant("kCFStreamPropertySocketNativeHandle")
    public static native String SocketNativeHandleValue();
    @GlobalConstant("kCFStreamPropertySocketRemoteHostName")
    public static native String SocketRemoteHostNameValue();
    @GlobalConstant("kCFStreamPropertySocketRemotePortNumber")
    public static native String SocketRemotePortNumberValue();
    
}
