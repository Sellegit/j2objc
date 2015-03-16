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
@Mapping("MTLSamplerMinMagFilter")
public final class MTLSamplerMinMagFilter extends ObjCEnum {
    
    @GlobalConstant("MTLSamplerMinMagFilterNearest")
    public static final long Nearest = 0L;
    @GlobalConstant("MTLSamplerMinMagFilterLinear")
    public static final long Linear = 1L;
    

}
