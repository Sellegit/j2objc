package apple.spritekit;


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
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;





@Library("SpriteKit/SpriteKit.h") @Mapping("SKTextureAtlas")
public class SKTextureAtlas 
    extends NSObject 
    implements NSCoding {

    
    
    public SKTextureAtlas() {}
    
    
    @Mapping("textureNames")
    public native List<String> getTextureNames();
    
    
    
    @Mapping("textureNamed:")
    public native SKTexture getTexture(String name);
    @Mapping("preloadWithCompletionHandler:")
    public native void preload(@Block Runnable completionHandler);
    @Mapping("atlasNamed:")
    public static native SKTextureAtlas create(String name);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("atlasWithDictionary:")
    protected static native SKTextureAtlas create(NSDictionary<?, ?> properties);
    @Mapping("preloadTextureAtlases:withCompletionHandler:")
    public static native void preloadTextureAtlases(NSArray<?> textureAtlases, @Block Runnable completionHandler);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
