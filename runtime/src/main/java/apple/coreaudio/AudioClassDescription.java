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





@Mapping("AudioClassDescription")
public class AudioClassDescription 
    extends Struct 
     {

    
    protected AudioClassDescription() {}
    
    
    @DotMapping("mType")
    public native int getMType();
    @DotMapping("mSubType")
    public native int getMSubType();
    @DotMapping("mManufacturer")
    public native int getMManufacturer();
    
    public static native AudioClassDescription create(int mType, int mSubType, int mManufacturer) /*-[
        AudioClassDescription __new = { .mType = mType, .mSubType = mSubType, .mManufacturer = mManufacturer };
        return __new;
    ]-*/;
    public static native AudioClassDescription copyWithmType(AudioClassDescription original, int mType) /*-[
        original.mType = mType;
        return original;
    ]-*/;

    
    public static native AudioClassDescription copyWithmSubType(AudioClassDescription original, int mSubType) /*-[
        original.mSubType = mSubType;
        return original;
    ]-*/;

    
    public static native AudioClassDescription copyWithmManufacturer(AudioClassDescription original, int mManufacturer) /*-[
        original.mManufacturer = mManufacturer;
        return original;
    ]-*/;

    
}
