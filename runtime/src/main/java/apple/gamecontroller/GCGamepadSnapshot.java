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





@Library("GameController") @Mapping("GCGamepadSnapshot")
public class GCGamepadSnapshot 
    extends GCGamepad 
     {

    
    
    public GCGamepadSnapshot() {}
    @Mapping("initWithSnapshotData:")
    public GCGamepadSnapshot(NSData data) { }
    @Mapping("initWithController:snapshotData:")
    public GCGamepadSnapshot(GCController controller, NSData data) { }
    
    
    @Mapping("snapshotData")
    public native NSData getSnapshotData();
    public native void setSnapshotData(NSData v);
    
    
    
    
    
}
