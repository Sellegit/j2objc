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


@Library("GameController/GameController.h") @Mapping("GCExtendedGamepadSnapshot")
public class GCExtendedGamepadSnapshot 
    extends GCExtendedGamepad 
     {

    
    
    @Mapping("initWithSnapshotData:")
    public GCExtendedGamepadSnapshot(NSData data) { }
    @Mapping("initWithController:snapshotData:")
    public GCExtendedGamepadSnapshot(GCController controller, NSData data) { }
    @Mapping("init")
    public GCExtendedGamepadSnapshot() { }

    
    @Mapping("snapshotData")
    public native NSData getSnapshotData();
    @Mapping("setSnapshotData:")
    public native void setSnapshotData(NSData v);

    
    


}
