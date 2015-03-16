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
public class SCNSceneSourceOptions 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNSceneSourceCreateNormalsIfAbsentKey")
    protected static native NSString CreateNormalsIfAbsentKey();
    @GlobalConstant("SCNSceneSourceCheckConsistencyKey")
    protected static native NSString CheckConsistencyKey();
    @GlobalConstant("SCNSceneSourceFlattenSceneKey")
    protected static native NSString FlattenSceneKey();
    @GlobalConstant("SCNSceneSourceUseSafeModeKey")
    protected static native NSString UseSafeModeKey();
    @GlobalConstant("SCNSceneSourceAssetDirectoryURLsKey")
    protected static native NSString AssetDirectoryURLsKey();
    @GlobalConstant("SCNSceneSourceOverrideAssetURLsKey")
    protected static native NSString OverrideAssetURLsKey();
    @GlobalConstant("SCNSceneSourceStrictConformanceKey")
    protected static native NSString StrictConformanceKey();
    @GlobalConstant("SCNSceneSourceConvertUnitsToMetersKey")
    protected static native NSString ConvertUnitsToMetersKey();
    @GlobalConstant("SCNSceneSourceConvertToYUpKey")
    protected static native NSString ConvertToYUpKey();
    @GlobalConstant("SCNSceneSourceAnimationImportPolicyKey")
    protected static native NSString AnimationImportPolicyKey();
    
}
