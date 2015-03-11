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

@Library("HomeKit") @Mapping("HMHome")
public class HMHome 
    extends NSObject 
     {

    
    
    public HMHome() {}
    
    
    @Mapping("delegate")
    public native HMHomeDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(HMHomeDelegate v);
    @Mapping("name")
    public native String getName();
    @Mapping("isPrimary")
    public native boolean isPrimary();
    @Mapping("accessories")
    public native NSArray<HMAccessory> getAccessories();
    @Mapping("users")
    public native NSArray<HMUser> getUsers();
    @Mapping("rooms")
    public native NSArray<HMRoom> getRooms();
    @Mapping("zones")
    public native NSArray<HMZone> getZones();
    @Mapping("serviceGroups")
    public native NSArray<HMServiceGroup> getServiceGroups();
    @Mapping("actionSets")
    public native NSArray<HMActionSet> getActionSets();
    @Mapping("triggers")
    public native NSArray<HMTrigger> getTriggers();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Mapping("addAccessory:completionHandler:")
    public native void addAccessory(HMAccessory accessory, @Block VoidBlock1<NSError> completion);
    @Mapping("removeAccessory:completionHandler:")
    public native void removeAccessory(HMAccessory accessory, @Block VoidBlock1<NSError> completion);
    @Mapping("assignAccessory:toRoom:completionHandler:")
    public native void assignAccessoryToRoom(HMAccessory accessory, HMRoom room, @Block VoidBlock1<NSError> completion);
    @Mapping("servicesWithTypes:")
    public native NSArray<HMService> getServicesWithTypes(List<HMServiceType> serviceTypes);
    @Mapping("unblockAccessory:completionHandler:")
    public native void unblockAccessory(HMAccessory accessory, @Block VoidBlock1<NSError> completion);
    @Mapping("addUserWithCompletionHandler:")
    public native void addUser(@Block VoidBlock2<HMUser, NSError> completion);
    @Mapping("removeUser:completionHandler:")
    public native void removeUser(HMUser user, @Block VoidBlock1<NSError> completion);
    @Mapping("addRoomWithName:completionHandler:")
    public native void addRoom(String roomName, @Block VoidBlock2<HMRoom, NSError> completion);
    @Mapping("removeRoom:completionHandler:")
    public native void removeRoom(HMRoom room, @Block VoidBlock1<NSError> completion);
    @Mapping("roomForEntireHome")
    public native HMRoom getRoomForEntireHome();
    @Mapping("addZoneWithName:completionHandler:")
    public native void addZone(String zoneName, @Block VoidBlock2<HMZone, NSError> completion);
    @Mapping("removeZone:completionHandler:")
    public native void removeZone(HMZone zone, @Block VoidBlock1<NSError> completion);
    @Mapping("addServiceGroupWithName:completionHandler:")
    public native void addServiceGroup(String serviceGroupName, @Block VoidBlock2<HMServiceGroup, NSError> completion);
    @Mapping("removeServiceGroup:completionHandler:")
    public native void removeServiceGroup(HMServiceGroup group, @Block VoidBlock1<NSError> completion);
    @Mapping("addActionSetWithName:completionHandler:")
    public native void addActionSet(String actionSetName, @Block VoidBlock2<HMActionSet, NSError> completion);
    @Mapping("removeActionSet:completionHandler:")
    public native void removeActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    @Mapping("executeActionSet:completionHandler:")
    public native void executeActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    @Mapping("addTrigger:completionHandler:")
    public native void addTrigger(HMTrigger trigger, @Block VoidBlock1<NSError> completion);
    @Mapping("removeTrigger:completionHandler:")
    public native void removeTrigger(HMTrigger trigger, @Block VoidBlock1<NSError> completion);
    
}
