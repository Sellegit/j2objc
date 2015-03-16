package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h") @Mapping("NSNotification")
public class NSNotification 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithName:object:userInfo:")
    public NSNotification(String name, Object object, NSDictionary<?, ?> userInfo) { }
    @Mapping("initWithCoder:")
    public NSNotification(NSCoder aDecoder) { }
    
    
    @Mapping("name")
    public native NSString getName();
    @Mapping("object")
    public native Object getObject();
    @Mapping("userInfo")
    public native NSDictionary<NSString, NSObject> getUserInfo();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
