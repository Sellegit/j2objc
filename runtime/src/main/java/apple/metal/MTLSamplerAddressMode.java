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
@Mapping("MTLSamplerAddressMode")
public final class MTLSamplerAddressMode extends ObjCEnum {
    
    @GlobalConstant("MTLSamplerAddressModeClampToEdge")
    public static final long ClampToEdge = 0L;
    @GlobalConstant("MTLSamplerAddressModeRepeat")
    public static final long Repeat = 2L;
    @GlobalConstant("MTLSamplerAddressModeMirrorRepeat")
    public static final long MirrorRepeat = 3L;
    @GlobalConstant("MTLSamplerAddressModeClampToZero")
    public static final long ClampToZero = 4L;
    

}
