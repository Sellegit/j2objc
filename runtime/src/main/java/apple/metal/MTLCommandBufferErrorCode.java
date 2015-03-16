package apple.metal;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal/Metal.h")
@Mapping("MTLCommandBufferErrorCode")
public final class MTLCommandBufferErrorCode extends ObjCEnum {
    
    @GlobalConstant("MTLCommandBufferErrorNone")
    public static final long None = 0L;
    @GlobalConstant("MTLCommandBufferErrorInternal")
    public static final long Internal = 1L;
    @GlobalConstant("MTLCommandBufferErrorTimeout")
    public static final long Timeout = 2L;
    @GlobalConstant("MTLCommandBufferErrorPageFault")
    public static final long PageFault = 3L;
    @GlobalConstant("MTLCommandBufferErrorBlacklisted")
    public static final long Blacklisted = 4L;
    @GlobalConstant("MTLCommandBufferErrorNotPermitted")
    public static final long NotPermitted = 7L;
    @GlobalConstant("MTLCommandBufferErrorOutOfMemory")
    public static final long OutOfMemory = 8L;
    @GlobalConstant("MTLCommandBufferErrorInvalidResource")
    public static final long InvalidResource = 9L;
    

}
