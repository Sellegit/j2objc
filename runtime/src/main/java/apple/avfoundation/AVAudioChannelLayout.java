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

@Library("AVFoundation") @Mapping("AVAudioChannelLayout")
public class AVAudioChannelLayout 
    extends NSObject 
     {

    
    
    public AVAudioChannelLayout() {}
    @Mapping("initWithLayoutTag:")
    public AVAudioChannelLayout(@Representing("AudioChannelLayoutTag") int layoutTag) { }
    @Mapping("initWithLayout:")
    public AVAudioChannelLayout(AudioChannelLayout layout) { }
    
    
    @Mapping("layoutTag")
    public native @Representing("AudioChannelLayoutTag") int getLayoutTag();
    @Mapping("layout")
    public native AudioChannelLayout getLayout();
    @Mapping("channelCount")
    public native int getChannelCount();
    
    
    
    @Mapping("isEqual:")
    public native boolean equalsTo(AVAudioChannelLayout object);
    @Mapping("layoutWithLayoutTag:")
    public static native AVAudioChannelLayout create(@Representing("AudioChannelLayoutTag") int layoutTag);
    @Mapping("layoutWithLayout:")
    public static native AVAudioChannelLayout create(AudioChannelLayout layout);
    
}
