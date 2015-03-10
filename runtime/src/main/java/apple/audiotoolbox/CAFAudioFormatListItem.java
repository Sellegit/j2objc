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





@Mapping("CAFAudioFormatListItem")
public class CAFAudioFormatListItem 
    extends Struct 
     {

    
    protected CAFAudioFormatListItem() {}
    
    
    @DotMapping("mFormat")
    public native CAFAudioDescription getMFormat();
    @DotMapping("mChannelLayoutTag")
    public native int getMChannelLayoutTag();
    
    public static native CAFAudioFormatListItem create(CAFAudioDescription mFormat, int mChannelLayoutTag) /*-[
        CAFAudioFormatListItem __new = { .mFormat = mFormat, .mChannelLayoutTag = mChannelLayoutTag };
        return __new;
    ]-*/;
    public static native CAFAudioFormatListItem copyWithmFormat(CAFAudioFormatListItem original, CAFAudioDescription mFormat) /*-[
        original.mFormat = mFormat;
        return __new;
    ]-*/;

    
    public static native CAFAudioFormatListItem copyWithmChannelLayoutTag(CAFAudioFormatListItem original, int mChannelLayoutTag) /*-[
        original.mChannelLayoutTag = mChannelLayoutTag;
        return __new;
    ]-*/;

    
}
