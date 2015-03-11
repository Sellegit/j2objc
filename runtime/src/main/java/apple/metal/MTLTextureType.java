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


@Mapping("MTLTextureType")
public final class MTLTextureType extends ObjCEnum {
    
    @GlobalConstant("MTLTextureType1D")
    public static final long _1D = 0L;
    @GlobalConstant("MTLTextureType1DArray")
    public static final long _1DArray = 1L;
    @GlobalConstant("MTLTextureType2D")
    public static final long _2D = 2L;
    @GlobalConstant("MTLTextureType2DArray")
    public static final long _2DArray = 3L;
    @GlobalConstant("MTLTextureType2DMultisample")
    public static final long _2DMultisample = 4L;
    @GlobalConstant("MTLTextureTypeCube")
    public static final long Cube = 5L;
    @GlobalConstant("MTLTextureType3D")
    public static final long _3D = 7L;
    

}
