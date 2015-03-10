package apple.homekit;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("HomeKit") @Mapping("HMRoom")
public class HMRoom 
    extends NSObject 
     {

    
    
    public HMRoom() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("accessories")
    public native NSArray<HMAccessory> getAccessories();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    
}
