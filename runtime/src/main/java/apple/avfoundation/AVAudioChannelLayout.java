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
 * @since Available in iOS 8.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioChannelLayout")
public class AVAudioChannelLayout 
    extends NSObject 
     {

    
    
    @Mapping("initWithLayoutTag:")
    public AVAudioChannelLayout(@Representing("AudioChannelLayoutTag") long layoutTag) { }
    @Mapping("initWithLayout:")
    public AVAudioChannelLayout(AudioChannelLayout layout) { }
    @Mapping("init")
    public AVAudioChannelLayout() { }
    
    
    @Mapping("layoutTag")
    public native @Representing("AudioChannelLayoutTag") long getLayoutTag();
    @Mapping("layout")
    public native AudioChannelLayout getLayout();
    @Mapping("channelCount")
    public native int getChannelCount();
    
    
    
    @Mapping("isEqual:")
    public native boolean equalsTo(Object object);
    @Mapping("layoutWithLayoutTag:")
    public static native AVAudioChannelLayout create(@Representing("AudioChannelLayoutTag") long layoutTag);
    @Mapping("layoutWithLayout:")
    public static native AVAudioChannelLayout create(AudioChannelLayout layout);
    
}
