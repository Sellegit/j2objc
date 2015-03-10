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


@Mapping("MTLPrimitiveType")
public final class MTLPrimitiveType extends ObjCEnum {
    
    @GlobalConstant("MTLPrimitiveTypePoint")
    public static final long Point = 0L;
    @GlobalConstant("MTLPrimitiveTypeLine")
    public static final long Line = 1L;
    @GlobalConstant("MTLPrimitiveTypeLineStrip")
    public static final long LineStrip = 2L;
    @GlobalConstant("MTLPrimitiveTypeTriangle")
    public static final long Triangle = 3L;
    @GlobalConstant("MTLPrimitiveTypeTriangleStrip")
    public static final long TriangleStrip = 4L;
    

}
