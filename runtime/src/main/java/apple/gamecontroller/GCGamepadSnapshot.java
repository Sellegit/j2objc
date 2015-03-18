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





@Library("GameController/GameController.h") @Mapping("GCGamepadSnapshot")
public class GCGamepadSnapshot 
    extends GCGamepad 
     {

    
    
    @Mapping("initWithSnapshotData:")
    public GCGamepadSnapshot(NSData data) { }
    @Mapping("initWithController:snapshotData:")
    public GCGamepadSnapshot(GCController controller, NSData data) { }
    @Mapping("init")
    public GCGamepadSnapshot() { }
    
    
    @Mapping("snapshotData")
    public native NSData getSnapshotData();
    @Mapping("setSnapshotData:")
    public native void setSnapshotData(NSData v);
    
    
    
    
    
}
