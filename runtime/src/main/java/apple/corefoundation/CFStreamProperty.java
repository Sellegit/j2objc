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
    protected static native String DataWrittenValue();
    @GlobalConstant("kCFStreamPropertyAppendToFile")
    protected static native String AppendToFileValue();
    @GlobalConstant("kCFStreamPropertyFileCurrentOffset")
    protected static native String FileCurrentOffsetValue();
    @GlobalConstant("kCFStreamPropertySocketNativeHandle")
    protected static native String SocketNativeHandleValue();
    @GlobalConstant("kCFStreamPropertySocketRemoteHostName")
    protected static native String SocketRemoteHostNameValue();
    @GlobalConstant("kCFStreamPropertySocketRemotePortNumber")
    protected static native String SocketRemotePortNumberValue();
    
}
