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


@Library("SceneKit/SceneKit.h") @Mapping("SCNSceneSource")
public class SCNSceneSource 
    extends NSObject 
     {

    
    
    @Mapping("initWithURL:options:")
    public SCNSceneSource(NSURL url, NSDictionary<?, ?> options) { }
    @Mapping("initWithData:options:")
    public SCNSceneSource(NSData data, NSDictionary<?, ?> options) { }
    @Mapping("init")
    public SCNSceneSource() { }

    
    @Mapping("url")
    public native NSURL getUrl();
    @Mapping("data")
    public native NSData getData();

    
    
    @Mapping("sceneWithOptions:error:")
    public native SCNScene newScene(NSDictionary<?, ?> options, Todo error);
    @Mapping("propertyForKey:")
    public native Object getProperty(String key);
    @Mapping("entriesPassingTest:")
    public native NSArray<?> getEntriesPassingTest(@Block Block3<NSObject, String, Todo, Boolean> predicate);
    @Mapping("sceneSourceWithURL:options:")
    public static native SCNSceneSource create(NSURL url, NSDictionary<?, ?> options);
    @Mapping("sceneSourceWithData:options:")
    public static native SCNSceneSource create(NSData data, NSDictionary<?, ?> options);

}
