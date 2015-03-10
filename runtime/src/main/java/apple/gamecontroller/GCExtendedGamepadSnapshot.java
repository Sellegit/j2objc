package apple.gamecontroller;


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





@Library("GameController") @Mapping("GCExtendedGamepadSnapshot")
public class GCExtendedGamepadSnapshot 
    extends GCExtendedGamepad 
     {

    
    
    public GCExtendedGamepadSnapshot() {}
    @Mapping("initWithSnapshotData:")
    public GCExtendedGamepadSnapshot(NSData data) { }
    @Mapping("initWithController:snapshotData:")
    public GCExtendedGamepadSnapshot(GCController controller, NSData data) { }
    
    
    @Mapping("snapshotData")
    public native NSData getSnapshotData();
    public native void setSnapshotData(NSData v);
    
    
    
    
    
}
