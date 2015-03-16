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





@Mapping("AudioBuffer") @Library("CoreAudio/CoreAudioTypes.h")
public class AudioBuffer 
    extends Struct 
     {

    
    protected AudioBuffer() {}
    
    
    @DotMapping("mNumberChannels")
    public native int getMNumberChannels();
    @DotMapping("mDataByteSize")
    public native int getMDataByteSize();
    @DotMapping("mData")
    public native Todo getMData();
    
    public static native AudioBuffer create(int mNumberChannels, int mDataByteSize, Todo mData) /*-[
        AudioBuffer __new = { .mNumberChannels = mNumberChannels, .mDataByteSize = mDataByteSize, .mData = mData };
        return __new;
    ]-*/;
    public static native AudioBuffer copyWithmNumberChannels(AudioBuffer original, int mNumberChannels) /*-[
        original.mNumberChannels = mNumberChannels;
        return original;
    ]-*/;

    
    public static native AudioBuffer copyWithmDataByteSize(AudioBuffer original, int mDataByteSize) /*-[
        original.mDataByteSize = mDataByteSize;
        return original;
    ]-*/;

    
    public static native AudioBuffer copyWithmData(AudioBuffer original, Todo mData) /*-[
        original.mData = mData;
        return original;
    ]-*/;

    
}
