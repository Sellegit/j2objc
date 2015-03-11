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


@Mapping("MTLStencilOperation")
public final class MTLStencilOperation extends ObjCEnum {
    
    @GlobalConstant("MTLStencilOperationKeep")
    public static final long Keep = 0L;
    @GlobalConstant("MTLStencilOperationZero")
    public static final long Zero = 1L;
    @GlobalConstant("MTLStencilOperationReplace")
    public static final long Replace = 2L;
    @GlobalConstant("MTLStencilOperationIncrementClamp")
    public static final long IncrementClamp = 3L;
    @GlobalConstant("MTLStencilOperationDecrementClamp")
    public static final long DecrementClamp = 4L;
    @GlobalConstant("MTLStencilOperationInvert")
    public static final long Invert = 5L;
    @GlobalConstant("MTLStencilOperationIncrementWrap")
    public static final long IncrementWrap = 6L;
    @GlobalConstant("MTLStencilOperationDecrementWrap")
    public static final long DecrementWrap = 7L;
    

}
