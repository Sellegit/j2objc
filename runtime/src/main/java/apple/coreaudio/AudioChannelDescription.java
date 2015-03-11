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





@Mapping("AudioChannelDescription")
public class AudioChannelDescription 
    extends Struct 
     {

    
    protected AudioChannelDescription() {}
    
    
    @DotMapping("mChannelLabel")
    public native AudioChannelLabel getMChannelLabel();
    @DotMapping("mChannelFlags")
    public native AudioChannelFlag getMChannelFlags();
    @DotMapping("mCoordinates")
    public native FloatBuffer getMCoordinates();
    
    public static native AudioChannelDescription create(AudioChannelLabel mChannelLabel, AudioChannelFlag mChannelFlags, FloatBuffer mCoordinates) /*-[
        AudioChannelDescription __new = { .mChannelLabel = mChannelLabel, .mChannelFlags = mChannelFlags, .mCoordinates = mCoordinates };
        return __new;
    ]-*/;
    public static native AudioChannelDescription copyWithmChannelLabel(AudioChannelDescription original, AudioChannelLabel mChannelLabel) /*-[
        original.mChannelLabel = mChannelLabel;
        return __new;
    ]-*/;

    
    public static native AudioChannelDescription copyWithmChannelFlags(AudioChannelDescription original, AudioChannelFlag mChannelFlags) /*-[
        original.mChannelFlags = mChannelFlags;
        return __new;
    ]-*/;

    
    public static native AudioChannelDescription copyWithmCoordinates(AudioChannelDescription original, FloatBuffer mCoordinates) /*-[
        original.mCoordinates = mCoordinates;
        return __new;
    ]-*/;

    
}
