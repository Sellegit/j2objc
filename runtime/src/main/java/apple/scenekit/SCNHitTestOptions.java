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
public class SCNHitTestOptions 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNHitTestFirstFoundOnlyKey")
    protected static native NSString FirstFoundOnlyKey();
    @GlobalConstant("SCNHitTestSortResultsKey")
    protected static native NSString SortResultsKey();
    @GlobalConstant("SCNHitTestClipToZRangeKey")
    protected static native NSString ClipToZRangeKey();
    @GlobalConstant("SCNHitTestBackFaceCullingKey")
    protected static native NSString BackFaceCullingKey();
    @GlobalConstant("SCNHitTestBoundingBoxOnlyKey")
    protected static native NSString BoundingBoxOnlyKey();
    @GlobalConstant("SCNHitTestIgnoreChildNodesKey")
    protected static native NSString IgnoreChildNodesKey();
    @GlobalConstant("SCNHitTestRootNodeKey")
    protected static native NSString RootNodeKey();
    @GlobalConstant("SCNHitTestIgnoreHiddenNodesKey")
    protected static native NSString IgnoreHiddenNodesKey();
    
}
