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





@Library("SpriteKit") @Mapping("SKLabelNode")
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
    public native void setVerticalAlignmentMode(@Representing("SKLabelVerticalAlignmentMode") @MachineSizedSInt long v);
    @Mapping("horizontalAlignmentMode")
    public native @Representing("SKLabelHorizontalAlignmentMode") @MachineSizedSInt long getHorizontalAlignmentMode();
    public native void setHorizontalAlignmentMode(@Representing("SKLabelHorizontalAlignmentMode") @MachineSizedSInt long v);
    @Mapping("fontName")
    public native String getFontName();
    public native void setFontName(String v);
    @Mapping("text")
    public native String getText();
    public native void setText(String v);
    @Mapping("fontSize")
    public native @MachineSizedFloat double getFontSize();
    public native void setFontSize(@MachineSizedFloat double v);
    @Mapping("fontColor")
    public native UIColor getFontColor();
    public native void setFontColor(UIColor v);
    @Mapping("colorBlendFactor")
    public native @MachineSizedFloat double getColorBlendFactor();
    public native void setColorBlendFactor(@MachineSizedFloat double v);
    @Mapping("color")
    public native UIColor getColor();
    public native void setColor(UIColor v);
    @Mapping("blendMode")
    public native @Representing("SKBlendMode") @MachineSizedSInt long getBlendMode();
    public native void setBlendMode(@Representing("SKBlendMode") @MachineSizedSInt long v);
    
    
    
    @Mapping("labelNodeWithText:")
    public static native SKLabelNode createWithText(String text);
    @Mapping("labelNodeWithFontNamed:")
    public static native SKLabelNode createWithFont(String fontName);
    
}
