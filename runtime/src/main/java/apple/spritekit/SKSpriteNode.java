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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKSpriteNode")
public class SKSpriteNode 
    extends SKNode 
     {

    
    
    public SKSpriteNode() {}
    @Mapping("initWithTexture:color:size:")
    public SKSpriteNode(SKTexture texture, UIColor color, CGSize size) { }
    @Mapping("initWithTexture:")
    public SKSpriteNode(SKTexture texture) { }
    @Mapping("initWithImageNamed:")
    public SKSpriteNode(String name) { }
    @Mapping("initWithColor:size:")
    public SKSpriteNode(UIColor color, CGSize size) { }
    @Mapping("initWithCoder:")
    public SKSpriteNode(NSCoder aDecoder) { }
    
    
    @Mapping("texture")
    public native SKTexture getTexture();
    @Mapping("setTexture:")
    public native void setTexture(SKTexture v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("normalTexture")
    public native SKTexture getNormalTexture();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setNormalTexture:")
    public native void setNormalTexture(SKTexture v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("lightingBitMask")
    public native int getLightingBitMask();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setLightingBitMask:")
    public native void setLightingBitMask(int v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shadowCastBitMask")
    public native int getShadowCastBitMask();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShadowCastBitMask:")
    public native void setShadowCastBitMask(int v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shadowedBitMask")
    public native int getShadowedBitMask();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShadowedBitMask:")
    public native void setShadowedBitMask(int v);
    @Mapping("centerRect")
    public native CGRect getCenterRect();
    @Mapping("setCenterRect:")
    public native void setCenterRect(CGRect v);
    @Mapping("colorBlendFactor")
    public native @MachineSizedFloat double getColorBlendFactor();
    @Mapping("setColorBlendFactor:")
    public native void setColorBlendFactor(@MachineSizedFloat double v);
    @Mapping("color")
    public native UIColor getColor();
    @Mapping("setColor:")
    public native void setColor(UIColor v);
    @Mapping("blendMode")
    public native @Representing("SKBlendMode") @MachineSizedSInt long getBlendMode();
    @Mapping("setBlendMode:")
    public native void setBlendMode(@Representing("SKBlendMode") @MachineSizedSInt long v);
    @Mapping("anchorPoint")
    public native CGPoint getAnchorPoint();
    @Mapping("setAnchorPoint:")
    public native void setAnchorPoint(CGPoint v);
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("setSize:")
    public native void setSize(CGSize v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shader")
    public native SKShader getShader();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShader:")
    public native void setShader(SKShader v);
    
    
    
    @Mapping("spriteNodeWithTexture:size:")
    public static native SKSpriteNode create(SKTexture texture, CGSize size);
    @Mapping("spriteNodeWithTexture:")
    public static native SKSpriteNode create(SKTexture texture);
    @Mapping("spriteNodeWithTexture:normalMap:")
    public static native SKSpriteNode create(SKTexture texture, SKTexture normalMap);
    @Mapping("spriteNodeWithImageNamed:")
    public static native SKSpriteNode create(String name);
    @Mapping("spriteNodeWithImageNamed:normalMapped:")
    public static native SKSpriteNode create(String name, boolean generateNormalMap);
    @Mapping("spriteNodeWithColor:size:")
    public static native SKSpriteNode create(UIColor color, CGSize size);
    
}
