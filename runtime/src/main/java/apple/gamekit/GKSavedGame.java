package apple.gamekit;


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
import apple.uikit.*;





@Library("GameKit/GameKit.h") @Mapping("GKSavedGame")
public class GKSavedGame 
    extends NSObject 
    implements NSCopying {

    
    
    public GKSavedGame() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("deviceName")
    public native String getDeviceName();
    @Mapping("modificationDate")
    public native NSDate getModificationDate();
    
    
    
    @Mapping("loadDataWithCompletionHandler:")
    public native void loadData(@Block VoidBlock2<NSData, NSError> handler);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
