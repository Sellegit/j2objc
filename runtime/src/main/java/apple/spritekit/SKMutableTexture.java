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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("SpriteKit/SpriteKit.h") @Mapping("SKMutableTexture")
public class SKMutableTexture 
    extends SKTexture 
     {

    
    
    @Mapping("initWithSize:")
    public SKMutableTexture(CGSize size) { }
    @Mapping("initWithSize:pixelFormat:")
    public SKMutableTexture(CGSize size, int format) { }
    @Mapping("initWithCoder:")
    public SKMutableTexture(NSCoder aDecoder) { }
    @Mapping("init")
    public SKMutableTexture() { }
    
    
    
    
    
    
    @Mapping("modifyPixelDataWithBlock:")
    public native void modifyPixelData(Todo block);
    @Mapping("mutableTextureWithSize:")
    public static native SKMutableTexture create(CGSize size);
    
}
