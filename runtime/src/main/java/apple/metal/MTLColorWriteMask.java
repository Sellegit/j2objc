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


@Mapping("MTLColorWriteMask")
public final class MTLColorWriteMask extends ObjCEnum {
    
    @GlobalConstant("MTLColorWriteMaskNone")
    public static final long None = 0L;
    @GlobalConstant("MTLColorWriteMaskRed")
    public static final long Red = 8L;
    @GlobalConstant("MTLColorWriteMaskGreen")
    public static final long Green = 4L;
    @GlobalConstant("MTLColorWriteMaskBlue")
    public static final long Blue = 2L;
    @GlobalConstant("MTLColorWriteMaskAlpha")
    public static final long Alpha = 1L;
    @GlobalConstant("MTLColorWriteMaskAll")
    public static final long All = 15L;
    

}
