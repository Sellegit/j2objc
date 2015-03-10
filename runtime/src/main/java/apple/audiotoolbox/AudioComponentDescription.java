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





@Mapping("AudioComponentDescription")
public class AudioComponentDescription 
    extends Struct 
     {

    
    protected AudioComponentDescription() {}
    
    
    @DotMapping("componentType")
    public native int getComponentType();
    @DotMapping("componentSubType")
    public native int getComponentSubType();
    @DotMapping("componentManufacturer")
    public native int getComponentManufacturer();
    @DotMapping("componentFlags")
    public native int getComponentFlags();
    @DotMapping("componentFlagsMask")
    public native int getComponentFlagsMask();
    
    public static native AudioComponentDescription create(int componentType, int componentSubType, int componentManufacturer, int componentFlags, int componentFlagsMask) /*-[
        AudioComponentDescription __new = { .componentType = componentType, .componentSubType = componentSubType, .componentManufacturer = componentManufacturer, .componentFlags = componentFlags, .componentFlagsMask = componentFlagsMask };
        return __new;
    ]-*/;
    public static native AudioComponentDescription copyWithcomponentType(AudioComponentDescription original, int componentType) /*-[
        original.componentType = componentType;
        return __new;
    ]-*/;

    
    public static native AudioComponentDescription copyWithcomponentSubType(AudioComponentDescription original, int componentSubType) /*-[
        original.componentSubType = componentSubType;
        return __new;
    ]-*/;

    
    public static native AudioComponentDescription copyWithcomponentManufacturer(AudioComponentDescription original, int componentManufacturer) /*-[
        original.componentManufacturer = componentManufacturer;
        return __new;
    ]-*/;

    
    public static native AudioComponentDescription copyWithcomponentFlags(AudioComponentDescription original, int componentFlags) /*-[
        original.componentFlags = componentFlags;
        return __new;
    ]-*/;

    
    public static native AudioComponentDescription copyWithcomponentFlagsMask(AudioComponentDescription original, int componentFlagsMask) /*-[
        original.componentFlagsMask = componentFlagsMask;
        return __new;
    ]-*/;

    
}
