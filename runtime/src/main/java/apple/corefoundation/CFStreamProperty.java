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
    public static native CFString DataWrittenValue();
    @GlobalConstant("kCFStreamPropertyAppendToFile")
    public static native CFString AppendToFileValue();
    @GlobalConstant("kCFStreamPropertyFileCurrentOffset")
    public static native CFString FileCurrentOffsetValue();
    @GlobalConstant("kCFStreamPropertySocketNativeHandle")
    public static native CFString SocketNativeHandleValue();
    @GlobalConstant("kCFStreamPropertySocketRemoteHostName")
    public static native CFString SocketRemoteHostNameValue();
    @GlobalConstant("kCFStreamPropertySocketRemotePortNumber")
    public static native CFString SocketRemotePortNumberValue();

}
