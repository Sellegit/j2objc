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

@Library("SpriteKit") @Mapping("SKRange")
public class SKRange 
    extends NSObject 
    implements NSCoding, NSCopying {

    
    
    public SKRange() {}
    @Mapping("initWithLowerLimit:upperLimit:")
    public SKRange(@MachineSizedFloat double lower, @MachineSizedFloat double upper) { }
    
    
    @Mapping("lowerLimit")
    public native @MachineSizedFloat double getLowerLimit();
    @Mapping("setLowerLimit:")
    public native void setLowerLimit(@MachineSizedFloat double v);
    @Mapping("upperLimit")
    public native @MachineSizedFloat double getUpperLimit();
    @Mapping("setUpperLimit:")
    public native void setUpperLimit(@MachineSizedFloat double v);
    
    
    
    @Mapping("rangeWithLowerLimit:upperLimit:")
    public static native SKRange create(@MachineSizedFloat double lower, @MachineSizedFloat double upper);
    @Mapping("rangeWithLowerLimit:")
    public static native SKRange createWithLowerLimit(@MachineSizedFloat double lower);
    @Mapping("rangeWithUpperLimit:")
    public static native SKRange createWithUpperLimit(@MachineSizedFloat double upper);
    @Mapping("rangeWithConstantValue:")
    public static native SKRange createWithConstantValue(@MachineSizedFloat double value);
    @Mapping("rangeWithValue:variance:")
    public static native SKRange createWithValue(@MachineSizedFloat double value, @MachineSizedFloat double variance);
    @Mapping("rangeWithNoLimits")
    public static native SKRange createWithNoLimits();
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
