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





@Library("CoreFoundation")
@Mapping("CFMessagePortErrorCode")
public final class CFMessagePortErrorCode extends ObjCEnum {
    
    @GlobalConstant("kCFMessagePortSuccess")
    public static final long Success = 0L;
    @GlobalConstant("kCFMessagePortSendTimeout")
    public static final long SendTimeout = -1L;
    @GlobalConstant("kCFMessagePortReceiveTimeout")
    public static final long ReceiveTimeout = -2L;
    @GlobalConstant("kCFMessagePortIsInvalid")
    public static final long IsInvalid = -3L;
    @GlobalConstant("kCFMessagePortTransportError")
    public static final long TransportError = -4L;
    @GlobalConstant("kCFMessagePortBecameInvalidError")
    public static final long BecameInvalidError = -5L;
    

}
