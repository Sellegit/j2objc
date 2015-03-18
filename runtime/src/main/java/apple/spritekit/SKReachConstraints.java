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

@Library("SpriteKit/SpriteKit.h") @Mapping("SKReachConstraints")
public class SKReachConstraints 
    extends NSObject 
    implements NSCoding {

    
    
    @Mapping("initWithLowerAngleLimit:upperAngleLimit:")
    public SKReachConstraints(@MachineSizedFloat double lowerAngleLimit, @MachineSizedFloat double upperAngleLimit) { }
    @Mapping("init")
    public SKReachConstraints() { }
    
    
    @Mapping("lowerAngleLimit")
    public native @MachineSizedFloat double getLowerAngleLimit();
    @Mapping("setLowerAngleLimit:")
    public native void setLowerAngleLimit(@MachineSizedFloat double v);
    @Mapping("upperAngleLimit")
    public native @MachineSizedFloat double getUpperAngleLimit();
    @Mapping("setUpperAngleLimit:")
    public native void setUpperAngleLimit(@MachineSizedFloat double v);
    
    
    
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
