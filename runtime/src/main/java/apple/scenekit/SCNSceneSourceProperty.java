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
public class SCNSceneSourceProperty 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNSceneSourceAssetContributorsKey")
    public static native NSString ContributorsValue();
    @GlobalConstant("SCNSceneSourceAssetCreatedDateKey")
    public static native NSString CreatedDateValue();
    @GlobalConstant("SCNSceneSourceAssetModifiedDateKey")
    public static native NSString ModifiedDateValue();
    @GlobalConstant("SCNSceneSourceAssetUpAxisKey")
    public static native NSString UpAxisValue();
    @GlobalConstant("SCNSceneSourceAssetUnitKey")
    public static native NSString UnitValue();

}
