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
    protected static native NSString ModelValue();
    @GlobalConstant("SCNViewTransform")
    protected static native NSString ViewValue();
    @GlobalConstant("SCNProjectionTransform")
    protected static native NSString ProjectionValue();
    @GlobalConstant("SCNNormalTransform")
    protected static native NSString NormalValue();
    @GlobalConstant("SCNModelViewTransform")
    protected static native NSString ModelViewValue();
    @GlobalConstant("SCNModelViewProjectionTransform")
    protected static native NSString ModelViewProjectionValue();
    
}
