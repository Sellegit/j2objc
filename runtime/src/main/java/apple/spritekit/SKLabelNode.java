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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKLabelNode")
public class SKLabelNode 
    extends SKNode 
     {

    
    
    public SKLabelNode() {}
    @Mapping("initWithFontNamed:")
    public SKLabelNode(String fontName) { }
    @Mapping("initWithCoder:")
    public SKLabelNode(NSCoder aDecoder) { }
    
    
    @Mapping("verticalAlignmentMode")
    public native @Representing("SKLabelVerticalAlignmentMode") @MachineSizedSInt long getVerticalAlignmentMode();
    @Mapping("setVerticalAlignmentMode:")
    public native void setVerticalAlignmentMode(@Representing("SKLabelVerticalAlignmentMode") @MachineSizedSInt long v);
    @Mapping("horizontalAlignmentMode")
    public native @Representing("SKLabelHorizontalAlignmentMode") @MachineSizedSInt long getHorizontalAlignmentMode();
    @Mapping("setHorizontalAlignmentMode:")
    public native void setHorizontalAlignmentMode(@Representing("SKLabelHorizontalAlignmentMode") @MachineSizedSInt long v);
    @Mapping("fontName")
    public native String getFontName();
    @Mapping("setFontName:")
    public native void setFontName(String v);
    @Mapping("text")
    public native String getText();
    @Mapping("setText:")
    public native void setText(String v);
    @Mapping("fontSize")
    public native @MachineSizedFloat double getFontSize();
    @Mapping("setFontSize:")
    public native void setFontSize(@MachineSizedFloat double v);
    @Mapping("fontColor")
    public native UIColor getFontColor();
    @Mapping("setFontColor:")
    public native void setFontColor(UIColor v);
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
    
    
    
    @Mapping("labelNodeWithText:")
    public static native SKLabelNode createWithText(String text);
    @Mapping("labelNodeWithFontNamed:")
    public static native SKLabelNode createWithFont(String fontName);
    
}
