package apple.mediaplayer;


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



/**
 * @since Available in iOS 7.1 and later.
 */

@Library("MediaPlayer") @Mapping("MPPlayableContentManager")
public class MPPlayableContentManager 
    extends NSObject 
     {

    
    
    public MPPlayableContentManager() {}
    
    
    @Mapping("dataSource")
    public native MPPlayableContentDataSource getDataSource();
    @Mapping("setDataSource:")
    public native void setDataSource(MPPlayableContentDataSource v);
    @Mapping("delegate")
    public native MPPlayableContentDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(MPPlayableContentDelegate v);
    
    
    
    @Mapping("reloadData")
    public native void reloadData();
    @Mapping("beginUpdates")
    public native void beginUpdates();
    @Mapping("endUpdates")
    public native void endUpdates();
    @Mapping("sharedContentManager")
    public static native MPPlayableContentManager getSharedContentManager();
    
}
