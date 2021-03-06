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
public class SCNLightingModel 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNLightingModelPhong")
    public static native NSString PhongValue();
    @GlobalConstant("SCNLightingModelBlinn")
    public static native NSString BlinnValue();
    @GlobalConstant("SCNLightingModelLambert")
    public static native NSString LambertValue();
    @GlobalConstant("SCNLightingModelConstant")
    public static native NSString ConstantValue();

}
