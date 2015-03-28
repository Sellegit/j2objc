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


@Mapping("AudioComponentDescription") @Library("AudioToolbox/AudioToolbox.h")
public class AudioComponentDescription 
    extends Struct 
     {

    
    private AudioComponentDescription() {}
    
    
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
        AudioComponentDescription __new = { .componentType = componentType, .componentSubType = original.componentSubType, .componentManufacturer = original.componentManufacturer, .componentFlags = original.componentFlags, .componentFlagsMask = original.componentFlagsMask };
        return __new;
    ]-*/;


    public static native AudioComponentDescription copyWithcomponentSubType(AudioComponentDescription original, int componentSubType) /*-[
        AudioComponentDescription __new = { .componentType = original.componentType, .componentSubType = componentSubType, .componentManufacturer = original.componentManufacturer, .componentFlags = original.componentFlags, .componentFlagsMask = original.componentFlagsMask };
        return __new;
    ]-*/;


    public static native AudioComponentDescription copyWithcomponentManufacturer(AudioComponentDescription original, int componentManufacturer) /*-[
        AudioComponentDescription __new = { .componentType = original.componentType, .componentSubType = original.componentSubType, .componentManufacturer = componentManufacturer, .componentFlags = original.componentFlags, .componentFlagsMask = original.componentFlagsMask };
        return __new;
    ]-*/;


    public static native AudioComponentDescription copyWithcomponentFlags(AudioComponentDescription original, int componentFlags) /*-[
        AudioComponentDescription __new = { .componentType = original.componentType, .componentSubType = original.componentSubType, .componentManufacturer = original.componentManufacturer, .componentFlags = componentFlags, .componentFlagsMask = original.componentFlagsMask };
        return __new;
    ]-*/;


    public static native AudioComponentDescription copyWithcomponentFlagsMask(AudioComponentDescription original, int componentFlagsMask) /*-[
        AudioComponentDescription __new = { .componentType = original.componentType, .componentSubType = original.componentSubType, .componentManufacturer = original.componentManufacturer, .componentFlags = original.componentFlags, .componentFlagsMask = componentFlagsMask };
        return __new;
    ]-*/;


    public static final class Adapter {

        public int componentType;
        public int componentSubType;
        public int componentManufacturer;
        public int componentFlags;
        public int componentFlagsMask;
        public Adapter(int componentType, int componentSubType, int componentManufacturer, int componentFlags, int componentFlagsMask) {
            this.componentType = componentType;
            this.componentSubType = componentSubType;
            this.componentManufacturer = componentManufacturer;
            this.componentFlags = componentFlags;
            this.componentFlagsMask = componentFlagsMask;
        }
        public Adapter(AudioComponentDescription original) {
            this.componentType = original.getComponentType();
            this.componentSubType = original.getComponentSubType();
            this.componentManufacturer = original.getComponentManufacturer();
            this.componentFlags = original.getComponentFlags();
            this.componentFlagsMask = original.getComponentFlagsMask();
        }
        public AudioComponentDescription convert() {
            return create(componentType, componentSubType, componentManufacturer, componentFlags, componentFlagsMask);
        }
    }
}
