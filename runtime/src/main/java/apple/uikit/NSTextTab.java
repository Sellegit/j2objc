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
 * @since Available in iOS 7.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("NSTextTab")
public class NSTextTab 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    @Mapping("initWithTextAlignment:location:options:")
    public NSTextTab(@Representing("NSTextAlignment") long alignment, @MachineSizedFloat double loc, NSDictionary<?, ?> options) { }
    @Mapping("init")
    public NSTextTab() { }

    
    @Mapping("alignment")
    public native @Representing("NSTextAlignment") long getAlignment();
    @Mapping("location")
    public native @MachineSizedFloat double getLocation();
    @Mapping("options")
    public native NSDictionary<?, ?> getOptions();

    
    
    @Mapping("columnTerminatorsForLocale:")
    public static native NSCharacterSet getColumnTerminators(NSLocale aLocale);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
