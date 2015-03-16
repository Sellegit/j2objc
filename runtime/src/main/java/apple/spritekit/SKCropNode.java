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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKCropNode")
public class SKCropNode 
    extends SKNode 
     {

    
    
    public SKCropNode() {}
    @Mapping("initWithCoder:")
    public SKCropNode(NSCoder aDecoder) { }
    
    
    @Mapping("maskNode")
    public native SKNode getMaskNode();
    @Mapping("setMaskNode:")
    public native void setMaskNode(SKNode v);
    
    
    
    
    
}
