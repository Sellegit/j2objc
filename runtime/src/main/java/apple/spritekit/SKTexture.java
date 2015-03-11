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





@Library("SpriteKit") @Mapping("SKTexture")
public class SKTexture 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public SKTexture() {}
    
    
    @Mapping("filteringMode")
    public native @Representing("SKTextureFilteringMode") @MachineSizedSInt long getFilteringMode();
    @Mapping("setFilteringMode:")
    public native void setFilteringMode(@Representing("SKTextureFilteringMode") @MachineSizedSInt long v);
    @Mapping("usesMipmaps")
    public native boolean usesMipmaps();
    @Mapping("setUsesMipmaps:")
    public native void setUsesMipmaps(boolean v);
    
    
    
    @Mapping("textureByApplyingCIFilter:")
    public native SKTexture newTextureByApplyingCIFilter(CIFilter filter);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("textureByGeneratingNormalMap")
    public native SKTexture newTextureByGeneratingNormalMap();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("textureByGeneratingNormalMapWithSmoothness:contrast:")
    public native SKTexture newTextureByGeneratingNormalMap(@MachineSizedFloat double smoothness, @MachineSizedFloat double contrast);
    @Mapping("textureRect")
    public native CGRect getTextureRect();
    @Mapping("size")
    public native CGSize size();
    @Mapping("preloadWithCompletionHandler:")
    public native void preload(@Block Runnable completionHandler);
    @Mapping("textureWithImageNamed:")
    public static native SKTexture create(String name);
    @Mapping("textureWithRect:inTexture:")
    public static native SKTexture create(CGRect rect, SKTexture texture);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("textureVectorNoiseWithSmoothness:size:")
    public static native SKTexture createVectorNoise(@MachineSizedFloat double smoothness, CGSize size);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("textureNoiseWithSmoothness:size:grayscale:")
    public static native SKTexture createNoise(@MachineSizedFloat double smoothness, CGSize size, boolean grayscale);
    @Mapping("textureWithCGImage:")
    public static native SKTexture create(CGImage image);
    @Mapping("textureWithImage:")
    public static native SKTexture create(UIImage image);
    @Mapping("textureWithData:size:")
    public static native SKTexture create(NSData pixelData, CGSize size);
    @Mapping("textureWithData:size:flipped:")
    public static native SKTexture create(NSData pixelData, CGSize size, boolean flipped);
    @Mapping("textureWithData:size:rowLength:alignment:")
    public static native SKTexture create(NSData pixelData, CGSize size, int rowLength, int alignment);
    @Mapping("preloadTextures:withCompletionHandler:")
    public static native void preloadTextures(NSArray<SKTexture> textures, @Block Runnable completionHandler);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
