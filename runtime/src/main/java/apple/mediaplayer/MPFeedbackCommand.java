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

@Library("MediaPlayer") @Mapping("MPFeedbackCommand")
public class MPFeedbackCommand 
    extends MPRemoteCommand 
     {

    
    
    public MPFeedbackCommand() {}
    
    
    @Mapping("isActive")
    public native boolean isActive();
    public native void setActive(boolean v);
    @Mapping("localizedTitle")
    public native String getLocalizedTitle();
    public native void setLocalizedTitle(String v);
    
    
    
    
    
}
