package apple.coregraphics;


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
import apple.uikit.*;






@Mapping("CGPathElementType")
public final class CGPathElementType extends ObjCEnum {
    
    @GlobalConstant("kCGPathElementMoveToPoint")
    public static final long MoveToPoint = 0L;
    @GlobalConstant("kCGPathElementAddLineToPoint")
    public static final long AddLineToPoint = 1L;
    @GlobalConstant("kCGPathElementAddQuadCurveToPoint")
    public static final long AddQuadCurveToPoint = 2L;
    @GlobalConstant("kCGPathElementAddCurveToPoint")
    public static final long AddCurveToPoint = 3L;
    @GlobalConstant("kCGPathElementCloseSubpath")
    public static final long CloseSubpath = 4L;
    

}
