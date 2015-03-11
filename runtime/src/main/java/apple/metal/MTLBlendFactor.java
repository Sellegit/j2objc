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

@Library("Metal")
@Mapping("MTLBlendFactor")
public final class MTLBlendFactor extends ObjCEnum {
    
    @GlobalConstant("MTLBlendFactorZero")
    public static final long Zero = 0L;
    @GlobalConstant("MTLBlendFactorOne")
    public static final long One = 1L;
    @GlobalConstant("MTLBlendFactorSourceColor")
    public static final long SourceColor = 2L;
    @GlobalConstant("MTLBlendFactorOneMinusSourceColor")
    public static final long OneMinusSourceColor = 3L;
    @GlobalConstant("MTLBlendFactorSourceAlpha")
    public static final long SourceAlpha = 4L;
    @GlobalConstant("MTLBlendFactorOneMinusSourceAlpha")
    public static final long OneMinusSourceAlpha = 5L;
    @GlobalConstant("MTLBlendFactorDestinationColor")
    public static final long DestinationColor = 6L;
    @GlobalConstant("MTLBlendFactorOneMinusDestinationColor")
    public static final long OneMinusDestinationColor = 7L;
    @GlobalConstant("MTLBlendFactorDestinationAlpha")
    public static final long DestinationAlpha = 8L;
    @GlobalConstant("MTLBlendFactorOneMinusDestinationAlpha")
    public static final long OneMinusDestinationAlpha = 9L;
    @GlobalConstant("MTLBlendFactorSourceAlphaSaturated")
    public static final long SourceAlphaSaturated = 10L;
    @GlobalConstant("MTLBlendFactorBlendColor")
    public static final long BlendColor = 11L;
    @GlobalConstant("MTLBlendFactorOneMinusBlendColor")
    public static final long OneMinusBlendColor = 12L;
    @GlobalConstant("MTLBlendFactorBlendAlpha")
    public static final long BlendAlpha = 13L;
    @GlobalConstant("MTLBlendFactorOneMinusBlendAlpha")
    public static final long OneMinusBlendAlpha = 14L;
    

}
