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
@Mapping("MTLFeatureSet")
public final class MTLFeatureSet extends ObjCEnum {
    
    @GlobalConstant("MTLFeatureSet_iOS_GPUFamily1_v1")
    public static final long _1_v1 = 0L;
    @GlobalConstant("MTLFeatureSet_iOS_GPUFamily2_v1")
    public static final long _2_v1 = 1L;
    

}
