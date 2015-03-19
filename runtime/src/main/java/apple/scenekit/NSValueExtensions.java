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
public final class NSValueExtensions 
    extends NSExtensions 
     {

    
    
    private NSValueExtensions() {}
    
    
    @ExtensionMapping("SCNVector3Value")
    public static native SCNVector3 getSCNVector3Value(NSValue thiz);
    @ExtensionMapping("SCNVector4Value")
    public static native SCNVector4 getSCNVector4Value(NSValue thiz);
    @ExtensionMapping("SCNMatrix4Value")
    public static native SCNMatrix4 getSCNMatrix4Value(NSValue thiz);
    
    
    
    @Mapping("valueWithSCNVector3:")
    public static native NSValue create(SCNVector3 v);
    @Mapping("valueWithSCNVector4:")
    public static native NSValue create(SCNVector4 v);
    @Mapping("valueWithSCNMatrix4:")
    public static native NSValue create(SCNMatrix4 v);
    
}
