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





@Library("SceneKit") @Mapping("SCNSceneSource")
public class SCNSceneSource 
    extends NSObject 
     {

    
    
    public SCNSceneSource() {}
    @Mapping("initWithURL:options:")
    public SCNSceneSource(NSURL url, SCNSceneSourceOptions options) { }
    @Mapping("initWithData:options:")
    public SCNSceneSource(NSData data, SCNSceneSourceOptions options) { }
    
    
    @Mapping("url")
    public native NSURL getUrl();
    @Mapping("data")
    public native NSData getData();
    
    
    
    @Mapping("sceneWithOptions:statusHandler:")
    public native SCNScene newScene(SCNSceneSourceOptions options, @Block VoidBlock4<Float, SCNSceneSourceStatus, NSError, Todo> statusHandler);
    @Mapping("sceneWithOptions:error:")
    protected native SCNScene newScene(SCNSceneSourceOptions options, Todo error);
    @Mapping("propertyForKey:")
    public native Object getProperty(SCNSceneSourceProperty key);
    @Mapping("entriesPassingTest:")
    public native NSArray<?> getEntriesPassingTest(@Block Block3<NSObject, String, Todo, Boolean> predicate);
    @Mapping("sceneSourceWithURL:options:")
    public static native SCNSceneSource create(NSURL url, SCNSceneSourceOptions options);
    @Mapping("sceneSourceWithData:options:")
    public static native SCNSceneSource create(NSData data, SCNSceneSourceOptions options);
    
}
