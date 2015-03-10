package apple.multipeerconnectivity;


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
import apple.uikit.*;
import apple.security.*;



/**
 * @since Available in iOS 7.0 and later.
 */


@Mapping("MCErrorCode")
public final class MCErrorCode extends ObjCEnum {
    
    @GlobalConstant("MCErrorUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("MCErrorNotConnected")
    public static final long NotConnected = 1L;
    @GlobalConstant("MCErrorInvalidParameter")
    public static final long InvalidParameter = 2L;
    @GlobalConstant("MCErrorUnsupported")
    public static final long Unsupported = 3L;
    @GlobalConstant("MCErrorTimedOut")
    public static final long TimedOut = 4L;
    @GlobalConstant("MCErrorCancelled")
    public static final long Cancelled = 5L;
    @GlobalConstant("MCErrorUnavailable")
    public static final long Unavailable = 6L;
    

}
