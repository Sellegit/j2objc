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

@Library("HomeKit/HomeKit.h") @Mapping("HMZone")
public class HMZone 
    extends NSObject 
     {

    
    
    public HMZone() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("rooms")
    public native NSArray<HMRoom> getRooms();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Mapping("addRoom:completionHandler:")
    public native void addRoom(HMRoom room, @Block VoidBlock1<NSError> completion);
    @Mapping("removeRoom:completionHandler:")
    public native void removeRoom(HMRoom room, @Block VoidBlock1<NSError> completion);
    
}
