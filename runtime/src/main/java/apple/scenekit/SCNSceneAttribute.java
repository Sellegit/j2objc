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
public class SCNSceneAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNSceneStartTimeAttributeKey")
    public static native NSString StartTimeValue();
    @GlobalConstant("SCNSceneEndTimeAttributeKey")
    public static native NSString EndTimeValue();
    @GlobalConstant("SCNSceneFrameRateAttributeKey")
    public static native NSString FrameRateValue();
    @GlobalConstant("SCNSceneUpAxisAttributeKey")
    public static native NSString UpAxisValue();

}
