package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioSessionPortDescription")
public class AVAudioSessionPortDescription 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVAudioSessionPortDescription() { }

    
    @Mapping("portType")
    public native AVAudioSessionPort getPortType();
    @Mapping("portName")
    public native String getPortName();
    @Mapping("UID")
    public native String getUID();
    @Mapping("channels")
    public native NSArray<AVAudioSessionChannelDescription> getChannels();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("dataSources")
    public native NSArray<AVAudioSessionDataSourceDescription> getDataSources();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("selectedDataSource")
    public native AVAudioSessionDataSourceDescription getSelectedDataSource();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredDataSource")
    public native AVAudioSessionDataSourceDescription getPreferredDataSource();

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPreferredDataSource:error:")
    public native boolean setPreferredDataSource(AVAudioSessionDataSourceDescription dataSource, Todo outError);

}
