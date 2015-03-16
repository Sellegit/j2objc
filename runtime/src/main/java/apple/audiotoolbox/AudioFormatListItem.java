package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("AudioFormatListItem") @Library("AudioToolbox/AudioToolbox.h")
public class AudioFormatListItem 
    extends Struct 
     {

    
    protected AudioFormatListItem() {}
    
    
    @DotMapping("mASBD")
    public native AudioStreamBasicDescription getMASBD();
    @DotMapping("mChannelLayoutTag")
    public native AudioChannelLayoutTag getMChannelLayoutTag();
    
    public static native AudioFormatListItem create(AudioStreamBasicDescription mASBD, AudioChannelLayoutTag mChannelLayoutTag) /*-[
        AudioFormatListItem __new = { .mASBD = mASBD, .mChannelLayoutTag = mChannelLayoutTag };
        return __new;
    ]-*/;
    public static native AudioFormatListItem copyWithmASBD(AudioFormatListItem original, AudioStreamBasicDescription mASBD) /*-[
        AudioFormatListItem __new = { .mASBD = mASBD, .mChannelLayoutTag = original.mChannelLayoutTag };
        return __new;
    ]-*/;

    
    public static native AudioFormatListItem copyWithmChannelLayoutTag(AudioFormatListItem original, AudioChannelLayoutTag mChannelLayoutTag) /*-[
        AudioFormatListItem __new = { .mASBD = original.mASBD, .mChannelLayoutTag = mChannelLayoutTag };
        return __new;
    ]-*/;

    
}
