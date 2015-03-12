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





@Mapping("AudioValueRange")
public class AudioValueRange 
    extends Struct 
     {

    
    protected AudioValueRange() {}
    
    
    @DotMapping("mMinimum")
    public native double getMMinimum();
    @DotMapping("mMaximum")
    public native double getMMaximum();
    
    public static native AudioValueRange create(double mMinimum, double mMaximum) /*-[
        AudioValueRange __new = { .mMinimum = mMinimum, .mMaximum = mMaximum };
        return __new;
    ]-*/;
    public static native AudioValueRange copyWithmMinimum(AudioValueRange original, double mMinimum) /*-[
        original.mMinimum = mMinimum;
        return original;
    ]-*/;

    
    public static native AudioValueRange copyWithmMaximum(AudioValueRange original, double mMaximum) /*-[
        original.mMaximum = mMaximum;
        return original;
    ]-*/;

    
}
