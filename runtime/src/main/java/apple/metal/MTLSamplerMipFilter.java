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


@Mapping("MTLSamplerMipFilter")
public final class MTLSamplerMipFilter extends ObjCEnum {
    
    @GlobalConstant("MTLSamplerMipFilterNotMipmapped")
    public static final long NotMipmapped = 0L;
    @GlobalConstant("MTLSamplerMipFilterNearest")
    public static final long Nearest = 1L;
    @GlobalConstant("MTLSamplerMipFilterLinear")
    public static final long Linear = 2L;
    

}
