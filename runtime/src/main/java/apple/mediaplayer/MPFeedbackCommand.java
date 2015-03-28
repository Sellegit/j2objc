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
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPFeedbackCommand")
public class MPFeedbackCommand 
    extends MPRemoteCommand 
     {

    
    
    @Mapping("init")
    public MPFeedbackCommand() { }

    
    @Mapping("isActive")
    public native boolean isActive();
    @Mapping("setActive:")
    public native void setActive(boolean v);
    @Mapping("localizedTitle")
    public native String getLocalizedTitle();
    @Mapping("setLocalizedTitle:")
    public native void setLocalizedTitle(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("localizedShortTitle")
    public native String getLocalizedShortTitle();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setLocalizedShortTitle:")
    public native void setLocalizedShortTitle(String v);

    
    


}
