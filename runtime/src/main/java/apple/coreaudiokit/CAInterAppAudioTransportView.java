package apple.coreaudiokit;


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
import apple.coreaudio.*;
import apple.uikit.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreAudioKit") @Mapping("CAInterAppAudioTransportView")
public class CAInterAppAudioTransportView 
    extends UIView 
     {

    
    
    public CAInterAppAudioTransportView() {}
    @Mapping("initWithFrame:")
    public CAInterAppAudioTransportView(CGRect frame) { }
    
    
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("isPlaying")
    public native boolean isPlaying();
    @Mapping("isRecording")
    public native boolean isRecording();
    @Mapping("isConnected")
    public native boolean isConnected();
    @Mapping("labelColor")
    public native UIColor getLabelColor();
    @Mapping("setLabelColor:")
    public native void setLabelColor(UIColor v);
    @Mapping("currentTimeLabelFont")
    public native UIFont getCurrentTimeLabelFont();
    @Mapping("setCurrentTimeLabelFont:")
    public native void setCurrentTimeLabelFont(UIFont v);
    @Mapping("rewindButtonColor")
    public native UIColor getRewindButtonColor();
    @Mapping("setRewindButtonColor:")
    public native void setRewindButtonColor(UIColor v);
    @Mapping("playButtonColor")
    public native UIColor getPlayButtonColor();
    @Mapping("setPlayButtonColor:")
    public native void setPlayButtonColor(UIColor v);
    @Mapping("pauseButtonColor")
    public native UIColor getPauseButtonColor();
    @Mapping("setPauseButtonColor:")
    public native void setPauseButtonColor(UIColor v);
    @Mapping("recordButtonColor")
    public native UIColor getRecordButtonColor();
    @Mapping("setRecordButtonColor:")
    public native void setRecordButtonColor(UIColor v);
    
    
    
    @Mapping("setOutputAudioUnit:")
    public native void setOutputAudioUnit(OpaqueAudioComponentInstance au);
    
}
