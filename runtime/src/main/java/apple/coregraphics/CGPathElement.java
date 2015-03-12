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





@Mapping("CGPathElement")
 class CGPathElement 
    extends Struct 
     {

    
    protected CGPathElement() {}
    
    
    @DotMapping("type")
    public native CGPathElementType getType();
    @DotMapping("points")
    public native CGPoint getPoints();
    
    public static native CGPathElement create(CGPathElementType type, CGPoint points) /*-[
        CGPathElement __new = { .type = type, .points = points };
        return __new;
    ]-*/;
    public static native CGPathElement copyWithtype(CGPathElement original, CGPathElementType type) /*-[
        original.type = type;
        return original;
    ]-*/;

    
    public static native CGPathElement copyWithpoints(CGPathElement original, CGPoint points) /*-[
        original.points = points;
        return original;
    ]-*/;

    
}
