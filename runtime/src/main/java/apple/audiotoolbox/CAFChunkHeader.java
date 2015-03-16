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





@Mapping("CAFChunkHeader") @Library("AudioToolbox/AudioToolbox.h")
public class CAFChunkHeader 
    extends Struct 
     {

    
    protected CAFChunkHeader() {}
    
    
    @DotMapping("mChunkType")
    public native int getMChunkType();
    @DotMapping("mChunkSize")
    public native long getMChunkSize();
    
    public static native CAFChunkHeader create(int mChunkType, long mChunkSize) /*-[
        CAFChunkHeader __new = { .mChunkType = mChunkType, .mChunkSize = mChunkSize };
        return __new;
    ]-*/;
    public static native CAFChunkHeader copyWithmChunkType(CAFChunkHeader original, int mChunkType) /*-[
        CAFChunkHeader __new = { .mChunkType = mChunkType, .mChunkSize = original.mChunkSize };
        return __new;
    ]-*/;

    
    public static native CAFChunkHeader copyWithmChunkSize(CAFChunkHeader original, long mChunkSize) /*-[
        CAFChunkHeader __new = { .mChunkType = original.mChunkType, .mChunkSize = mChunkSize };
        return __new;
    ]-*/;

    
}
