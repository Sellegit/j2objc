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

@Library("PushKit") @Mapping("PKPushRegistry")
public class PKPushRegistry 
    extends NSObject 
     {

    
    
    public PKPushRegistry() {}
    @Mapping("initWithQueue:")
    public PKPushRegistry(DispatchQueue queue) { }
    
    
    @Mapping("delegate")
    public native PKPushRegistryDelegate getDelegate();
    public native void setDelegate(PKPushRegistryDelegate v);
    @Mapping("desiredPushTypes")
    public native Set<String> getDesiredPushTypes();
    public native void setDesiredPushTypes(Set<String> v);
    
    
    
    @Mapping("pushTokenForType:")
    public native NSData getPushTokenForType(String type);
    
}
