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

@Library("HomeKit/HomeKit.h") @Mapping("HMHomeDelegate")
public interface HMHomeDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("homeDidUpdateName:")
    void didUpdateName(HMHome home);
    @Mapping("home:didAddAccessory:")
    void didAddAccessory(HMHome home, HMAccessory accessory);
    @Mapping("home:didRemoveAccessory:")
    void didRemoveAccessory(HMHome home, HMAccessory accessory);
    @Mapping("home:didAddUser:")
    void didAddUser(HMHome home, HMUser user);
    @Mapping("home:didRemoveUser:")
    void didRemoveUser(HMHome home, HMUser user);
    @Mapping("home:didUpdateRoom:forAccessory:")
    void didUpdateRoom(HMHome home, HMRoom room, HMAccessory accessory);
    @Mapping("home:didAddRoom:")
    void didAddRoom(HMHome home, HMRoom room);
    @Mapping("home:didRemoveRoom:")
    void didRemoveRoom(HMHome home, HMRoom room);
    @Mapping("home:didUpdateNameForRoom:")
    void didUpdateRoomName(HMHome home, HMRoom room);
    @Mapping("home:didAddZone:")
    void didAddZone(HMHome home, HMZone zone);
    @Mapping("home:didRemoveZone:")
    void didRemoveZone(HMHome home, HMZone zone);
    @Mapping("home:didUpdateNameForZone:")
    void didUpdateZoneName(HMHome home, HMZone zone);
    @Mapping("home:didAddRoom:toZone:")
    void didAddRoomToZone(HMHome home, HMRoom room, HMZone zone);
    @Mapping("home:didRemoveRoom:fromZone:")
    void didRemoveRoomFromZone(HMHome home, HMRoom room, HMZone zone);
    @Mapping("home:didAddServiceGroup:")
    void didAddServiceGroup(HMHome home, HMServiceGroup group);
    @Mapping("home:didRemoveServiceGroup:")
    void didRemoveServiceGroup(HMHome home, HMServiceGroup group);
    @Mapping("home:didUpdateNameForServiceGroup:")
    void didUpdateServiceGroupName(HMHome home, HMServiceGroup group);
    @Mapping("home:didAddService:toServiceGroup:")
    void didAddServiceToServiceGroup(HMHome home, HMService service, HMServiceGroup group);
    @Mapping("home:didRemoveService:fromServiceGroup:")
    void didRemoveServiceFromServiceGroup(HMHome home, HMService service, HMServiceGroup group);
    @Mapping("home:didAddActionSet:")
    void didAddActionSet(HMHome home, HMActionSet actionSet);
    @Mapping("home:didRemoveActionSet:")
    void didRemoveActionSet(HMHome home, HMActionSet actionSet);
    @Mapping("home:didUpdateNameForActionSet:")
    void didUpdateActionSetName(HMHome home, HMActionSet actionSet);
    @Mapping("home:didUpdateActionsForActionSet:")
    void didUpdateActions(HMHome home, HMActionSet actionSet);
    @Mapping("home:didAddTrigger:")
    void didAddTrigger(HMHome home, HMTrigger trigger);
    @Mapping("home:didRemoveTrigger:")
    void didRemoveTrigger(HMHome home, HMTrigger trigger);
    @Mapping("home:didUpdateNameForTrigger:")
    void didUpdateTriggerName(HMHome home, HMTrigger trigger);
    @Mapping("home:didUpdateTrigger:")
    void didUpdateTrigger(HMHome home, HMTrigger trigger);
    @Mapping("home:didUnblockAccessory:")
    void didUnblockAccessory(HMHome home, HMAccessory accessory);
    @Mapping("home:didEncounterError:forAccessory:")
    void didEncounterError(HMHome home, NSError error, HMAccessory accessory);
    
    /*<adapter>*/
    /*</adapter>*/
}
