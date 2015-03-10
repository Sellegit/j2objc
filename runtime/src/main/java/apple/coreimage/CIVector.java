package apple.coreimage;


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
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;





@Library("CoreImage") @Mapping("CIVector")
public class CIVector 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public CIVector() {}
    @Mapping("initWithX:")
    public CIVector(@MachineSizedFloat double x) { }
    @Mapping("initWithX:Y:")
    public CIVector(@MachineSizedFloat double x, @MachineSizedFloat double y) { }
    @Mapping("initWithX:Y:Z:")
    public CIVector(@MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double z) { }
    @Mapping("initWithX:Y:Z:W:")
    public CIVector(@MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double z, @MachineSizedFloat double w) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithCGPoint:")
    public CIVector(CGPoint p) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithCGRect:")
    public CIVector(CGRect r) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithCGAffineTransform:")
    public CIVector(CGAffineTransform r) { }
    @Mapping("initWithString:")
    public CIVector(String representation) { }
    
    
    
    
    
    
    @Mapping("valueAtIndex:")
    public native @MachineSizedFloat double getValueAtIndex(@MachineSizedUInt long index);
    @Mapping("count")
    public native @MachineSizedUInt long getCount();
    @Mapping("X")
    public native @MachineSizedFloat double getX();
    @Mapping("Y")
    public native @MachineSizedFloat double getY();
    @Mapping("Z")
    public native @MachineSizedFloat double getZ();
    @Mapping("W")
    public native @MachineSizedFloat double getW();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("CGPointValue")
    public native CGPoint getCGPointValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("CGRectValue")
    public native CGRect getCGRectValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("CGAffineTransformValue")
    public native CGAffineTransform getCGAffineTransformValue();
    @Mapping("stringRepresentation")
    public native String getStringRepresentation();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
