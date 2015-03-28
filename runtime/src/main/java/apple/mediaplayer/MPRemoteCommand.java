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
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPRemoteCommand")
public class MPRemoteCommand 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public MPRemoteCommand() { }

    
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);

    
    
    @Mapping("addTarget:action:")
    public native void addTarget(Object target, Selector action);
    @Mapping("removeTarget:action:")
    public native void removeTarget(Object target, Selector action);
    @Mapping("removeTarget:")
    public native void removeTarget(Object target);
    @Mapping("addTargetWithHandler:")
    public native Object addTarget(@Block Block1<MPRemoteCommandEvent, MPRemoteCommandHandlerStatus> handler);

}
