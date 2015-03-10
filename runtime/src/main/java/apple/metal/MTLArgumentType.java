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


@Mapping("MTLArgumentType")
public final class MTLArgumentType extends ObjCEnum {
    
    @GlobalConstant("MTLArgumentTypeBuffer")
    public static final long Buffer = 0L;
    @GlobalConstant("MTLArgumentTypeThreadgroupMemory")
    public static final long ThreadgroupMemory = 1L;
    @GlobalConstant("MTLArgumentTypeTexture")
    public static final long Texture = 2L;
    @GlobalConstant("MTLArgumentTypeSampler")
    public static final long Sampler = 3L;
    

}
