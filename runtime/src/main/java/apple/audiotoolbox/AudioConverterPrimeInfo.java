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





@Mapping("AudioConverterPrimeInfo")
public class AudioConverterPrimeInfo 
    extends Struct 
     {

    
    protected AudioConverterPrimeInfo() {}
    
    
    @DotMapping("leadingFrames")
    public native int getLeadingFrames();
    @DotMapping("trailingFrames")
    public native int getTrailingFrames();
    
    public static native AudioConverterPrimeInfo create(int leadingFrames, int trailingFrames) /*-[
        AudioConverterPrimeInfo __new = { .leadingFrames = leadingFrames, .trailingFrames = trailingFrames };
        return __new;
    ]-*/;
    public static native AudioConverterPrimeInfo copyWithleadingFrames(AudioConverterPrimeInfo original, int leadingFrames) /*-[
        original.leadingFrames = leadingFrames;
        return __new;
    ]-*/;

    
    public static native AudioConverterPrimeInfo copyWithtrailingFrames(AudioConverterPrimeInfo original, int trailingFrames) /*-[
        original.trailingFrames = trailingFrames;
        return __new;
    ]-*/;

    
}
