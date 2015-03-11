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





@Mapping("AudioBufferList")
public class AudioBufferList 
    extends Struct 
     {

    
    protected AudioBufferList() {}
    
    
    @DotMapping("mNumberBuffers")
    public native int getMNumberBuffers();
    @DotMapping("mBuffers")
    public native AudioBuffer getMBuffers();
    
    public static native AudioBufferList create(int mNumberBuffers, AudioBuffer mBuffers) /*-[
        AudioBufferList __new = { .mNumberBuffers = mNumberBuffers, .mBuffers = mBuffers };
        return __new;
    ]-*/;
    public static native AudioBufferList copyWithmNumberBuffers(AudioBufferList original, int mNumberBuffers) /*-[
        original.mNumberBuffers = mNumberBuffers;
        return __new;
    ]-*/;

    
    public static native AudioBufferList copyWithmBuffers(AudioBufferList original, AudioBuffer mBuffers) /*-[
        original.mBuffers = mBuffers;
        return __new;
    ]-*/;

    
}
