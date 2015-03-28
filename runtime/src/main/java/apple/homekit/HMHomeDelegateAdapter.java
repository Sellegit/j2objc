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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class HMHomeDelegateAdapter 
    extends Object 
    implements HMHomeDelegate {

    
    
    


    
    
    @NotImplemented("homeDidUpdateName:")
    public void didUpdateName(HMHome home) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddAccessory:")
    public void didAddAccessory(HMHome home, HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveAccessory:")
    public void didRemoveAccessory(HMHome home, HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddUser:")
    public void didAddUser(HMHome home, HMUser user) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveUser:")
    public void didRemoveUser(HMHome home, HMUser user) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateRoom:forAccessory:")
    public void didUpdateRoom(HMHome home, HMRoom room, HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddRoom:")
    public void didAddRoom(HMHome home, HMRoom room) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveRoom:")
    public void didRemoveRoom(HMHome home, HMRoom room) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateNameForRoom:")
    public void didUpdateRoomName(HMHome home, HMRoom room) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddZone:")
    public void didAddZone(HMHome home, HMZone zone) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveZone:")
    public void didRemoveZone(HMHome home, HMZone zone) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateNameForZone:")
    public void didUpdateZoneName(HMHome home, HMZone zone) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddRoom:toZone:")
    public void didAddRoomToZone(HMHome home, HMRoom room, HMZone zone) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveRoom:fromZone:")
    public void didRemoveRoomFromZone(HMHome home, HMRoom room, HMZone zone) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddServiceGroup:")
    public void didAddServiceGroup(HMHome home, HMServiceGroup group) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveServiceGroup:")
    public void didRemoveServiceGroup(HMHome home, HMServiceGroup group) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateNameForServiceGroup:")
    public void didUpdateServiceGroupName(HMHome home, HMServiceGroup group) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddService:toServiceGroup:")
    public void didAddServiceToServiceGroup(HMHome home, HMService service, HMServiceGroup group) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveService:fromServiceGroup:")
    public void didRemoveServiceFromServiceGroup(HMHome home, HMService service, HMServiceGroup group) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddActionSet:")
    public void didAddActionSet(HMHome home, HMActionSet actionSet) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveActionSet:")
    public void didRemoveActionSet(HMHome home, HMActionSet actionSet) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateNameForActionSet:")
    public void didUpdateActionSetName(HMHome home, HMActionSet actionSet) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateActionsForActionSet:")
    public void didUpdateActions(HMHome home, HMActionSet actionSet) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didAddTrigger:")
    public void didAddTrigger(HMHome home, HMTrigger trigger) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didRemoveTrigger:")
    public void didRemoveTrigger(HMHome home, HMTrigger trigger) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateNameForTrigger:")
    public void didUpdateTriggerName(HMHome home, HMTrigger trigger) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUpdateTrigger:")
    public void didUpdateTrigger(HMHome home, HMTrigger trigger) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didUnblockAccessory:")
    public void didUnblockAccessory(HMHome home, HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("home:didEncounterError:forAccessory:")
    public void didEncounterError(HMHome home, NSError error, HMAccessory accessory) { throw new UnsupportedOperationException(); }

}
