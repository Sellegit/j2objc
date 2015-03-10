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

@Library("SpriteKit") @Mapping("SKRegion")
public class SKRegion 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public SKRegion() {}
    @Mapping("initWithRadius:")
    public SKRegion(float radius) { }
    @Mapping("initWithSize:")
    public SKRegion(CGSize size) { }
    @Mapping("initWithPath:")
    public SKRegion(CGPath path) { }
    
    
    @Mapping("path")
    public native CGPath getPath();
    
    
    
    @Mapping("inverseRegion")
    public native SKRegion inverseRegion();
    @Mapping("regionByUnionWithRegion:")
    public native SKRegion newRegionByUnionWithRegion(SKRegion region);
    @Mapping("regionByDifferenceFromRegion:")
    public native SKRegion newRegionByDifferenceFromRegion(SKRegion region);
    @Mapping("regionByIntersectionWithRegion:")
    public native SKRegion newRegionByIntersectionWithRegion(SKRegion region);
    @Mapping("containsPoint:")
    public native boolean containsPoint(CGPoint point);
    @Mapping("infiniteRegion")
    public static native SKRegion createInfiniteRegion();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
