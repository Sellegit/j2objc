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





@Mapping("AudioValueTranslation")
public class AudioValueTranslation 
    extends Struct 
     {

    
    protected AudioValueTranslation() {}
    
    
    @DotMapping("mInputData")
    public native Todo getMInputData();
    @DotMapping("mInputDataSize")
    public native int getMInputDataSize();
    @DotMapping("mOutputData")
    public native Todo getMOutputData();
    @DotMapping("mOutputDataSize")
    public native int getMOutputDataSize();
    
    public static native AudioValueTranslation create(Todo mInputData, int mInputDataSize, Todo mOutputData, int mOutputDataSize) /*-[
        AudioValueTranslation __new = { .mInputData = mInputData, .mInputDataSize = mInputDataSize, .mOutputData = mOutputData, .mOutputDataSize = mOutputDataSize };
        return __new;
    ]-*/;
    public static native AudioValueTranslation copyWithmInputData(AudioValueTranslation original, Todo mInputData) /*-[
        original.mInputData = mInputData;
        return __new;
    ]-*/;

    
    public static native AudioValueTranslation copyWithmInputDataSize(AudioValueTranslation original, int mInputDataSize) /*-[
        original.mInputDataSize = mInputDataSize;
        return __new;
    ]-*/;

    
    public static native AudioValueTranslation copyWithmOutputData(AudioValueTranslation original, Todo mOutputData) /*-[
        original.mOutputData = mOutputData;
        return __new;
    ]-*/;

    
    public static native AudioValueTranslation copyWithmOutputDataSize(AudioValueTranslation original, int mOutputDataSize) /*-[
        original.mOutputDataSize = mOutputDataSize;
        return __new;
    ]-*/;

    
}
