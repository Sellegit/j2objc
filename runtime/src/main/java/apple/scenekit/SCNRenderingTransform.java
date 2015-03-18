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


/*<javadoc>*/
/*</javadoc>*/
@Library("SceneKit/SceneKit.h")
public class SCNRenderingTransform 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNModelTransform")
    public static native NSString ModelValue();
    @GlobalConstant("SCNViewTransform")
    public static native NSString ViewValue();
    @GlobalConstant("SCNProjectionTransform")
    public static native NSString ProjectionValue();
    @GlobalConstant("SCNNormalTransform")
    public static native NSString NormalValue();
    @GlobalConstant("SCNModelViewTransform")
    public static native NSString ModelViewValue();
    @GlobalConstant("SCNModelViewProjectionTransform")
    public static native NSString ModelViewProjectionValue();
    
}
