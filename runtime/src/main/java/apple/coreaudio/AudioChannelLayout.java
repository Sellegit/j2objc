package apple.coreaudio;


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





@Mapping("AudioChannelLayout") @Library("CoreAudio/CoreAudioTypes.h")
public class AudioChannelLayout 
    extends Struct 
     {

    
    protected AudioChannelLayout() {}
    
    
    @DotMapping("mChannelLayoutTag")
    public native AudioChannelLayoutTag getMChannelLayoutTag();
    @DotMapping("mChannelBitmap")
    public native int getMChannelBitmap();
    @DotMapping("mNumberChannelDescriptions")
    public native int getMNumberChannelDescriptions();
    @DotMapping("mChannelDescriptions")
    public native AudioChannelDescription getMChannelDescriptions();
    
    
}
