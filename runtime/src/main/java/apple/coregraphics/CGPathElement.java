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


@Mapping("CGPathElement") @Library("CoreGraphics/CoreGraphics.h")
 class CGPathElement 
    extends Struct 
     {

    
    private CGPathElement() {}
    
    
    @DotMapping("type")
    public native CGPathElementType getType();
    @DotMapping("points")
    public native CGPoint getPoints();

    
}
