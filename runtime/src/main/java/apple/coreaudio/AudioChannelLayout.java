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





@Mapping("AudioChannelLayout")
public class AudioChannelLayout 
    extends Struct 
     {

    
    protected AudioChannelLayout() {}
    
    
    @DotMapping("mChannelLayoutTag")
    public native AudioChannelLayoutTag getMChannelLayoutTag();
    @DotMapping("mChannelBitmap")
    public native AudioChannelBit getMChannelBitmap();
    @DotMapping("mNumberChannelDescriptions")
    public native int getMNumberChannelDescriptions();
    @DotMapping("mChannelDescriptions")
    public native AudioChannelDescription getMChannelDescriptions();
    
    public static native AudioChannelLayout create(AudioChannelLayoutTag mChannelLayoutTag, AudioChannelBit mChannelBitmap, int mNumberChannelDescriptions, AudioChannelDescription mChannelDescriptions) /*-[
        AudioChannelLayout __new = { .mChannelLayoutTag = mChannelLayoutTag, .mChannelBitmap = mChannelBitmap, .mNumberChannelDescriptions = mNumberChannelDescriptions, .mChannelDescriptions = mChannelDescriptions };
        return __new;
    ]-*/;
    public static native AudioChannelLayout copyWithmChannelLayoutTag(AudioChannelLayout original, AudioChannelLayoutTag mChannelLayoutTag) /*-[
        original.mChannelLayoutTag = mChannelLayoutTag;
        return original;
    ]-*/;

    
    public static native AudioChannelLayout copyWithmChannelBitmap(AudioChannelLayout original, AudioChannelBit mChannelBitmap) /*-[
        original.mChannelBitmap = mChannelBitmap;
        return original;
    ]-*/;

    
    public static native AudioChannelLayout copyWithmNumberChannelDescriptions(AudioChannelLayout original, int mNumberChannelDescriptions) /*-[
        original.mNumberChannelDescriptions = mNumberChannelDescriptions;
        return original;
    ]-*/;

    
    public static native AudioChannelLayout copyWithmChannelDescriptions(AudioChannelLayout original, AudioChannelDescription mChannelDescriptions) /*-[
        original.mChannelDescriptions = mChannelDescriptions;
        return original;
    ]-*/;

    
}
