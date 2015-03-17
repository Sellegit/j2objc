package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;





@Library("QuartzCore/QuartzCore.h")
@Mapping("CAEdgeAntialiasingMask")
public final class CAEdgeAntialiasingMask extends ObjCEnum {
    
    @GlobalConstant("kCALayerLeftEdge")
    public static final long LeftEdge = 1L;
    @GlobalConstant("kCALayerRightEdge")
    public static final long RightEdge = 2L;
    @GlobalConstant("kCALayerBottomEdge")
    public static final long BottomEdge = 4L;
    @GlobalConstant("kCALayerTopEdge")
    public static final long TopEdge = 8L;
    

}
