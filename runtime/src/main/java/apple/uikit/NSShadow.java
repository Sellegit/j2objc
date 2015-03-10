package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit") @Mapping("NSShadow")
public class NSShadow 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public NSShadow() {}
    
    
    @Mapping("shadowOffset")
    public native CGSize getShadowOffset();
    @Mapping("setShadowOffset:")
    public native void setShadowOffset(CGSize v);
    @Mapping("shadowBlurRadius")
    public native @MachineSizedFloat double getShadowBlurRadius();
    @Mapping("setShadowBlurRadius:")
    public native void setShadowBlurRadius(@MachineSizedFloat double v);
    @Mapping("shadowColor")
    public native UIColor getShadowColor();
    @Mapping("setShadowColor:")
    public native void setShadowColor(UIColor v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
