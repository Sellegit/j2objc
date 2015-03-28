package apple.pushkit;


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
import apple.dispatch.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("PushKit/PushKit.h") @Mapping("PKPushRegistry")
public class PKPushRegistry 
    extends NSObject 
     {

    
    
    @Mapping("initWithQueue:")
    public PKPushRegistry(DispatchQueue queue) { }
    @Mapping("init")
    public PKPushRegistry() { }

    
    @Mapping("delegate")
    public native PKPushRegistryDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(PKPushRegistryDelegate v);
    @Mapping("desiredPushTypes")
    public native Set<String> getDesiredPushTypes();
    @Mapping("setDesiredPushTypes:")
    public native void setDesiredPushTypes(Set<String> v);

    
    
    @Mapping("pushTokenForType:")
    public native NSData getPushTokenForType(String type);

}
