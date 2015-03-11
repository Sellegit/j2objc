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


@Mapping("MTLPurgeableState")
public final class MTLPurgeableState extends ObjCEnum {
    
    @GlobalConstant("MTLPurgeableStateKeepCurrent")
    public static final long KeepCurrent = 1L;
    @GlobalConstant("MTLPurgeableStateNonVolatile")
    public static final long NonVolatile = 2L;
    @GlobalConstant("MTLPurgeableStateVolatile")
    public static final long Volatile = 3L;
    @GlobalConstant("MTLPurgeableStateEmpty")
    public static final long Empty = 4L;
    

}
