package apple.scenekit;


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
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;


@Library("SceneKit/SceneKit.h")
@Mapping("SCNGeometryPrimitiveType")
public final class SCNGeometryPrimitiveType extends ObjCEnum {
    
    @GlobalConstant("SCNGeometryPrimitiveTypeTriangles")
    public static final long Triangles = 0L;
    @GlobalConstant("SCNGeometryPrimitiveTypeTriangleStrip")
    public static final long TriangleStrip = 1L;
    @GlobalConstant("SCNGeometryPrimitiveTypeLine")
    public static final long Line = 2L;
    @GlobalConstant("SCNGeometryPrimitiveTypePoint")
    public static final long Point = 3L;


}
