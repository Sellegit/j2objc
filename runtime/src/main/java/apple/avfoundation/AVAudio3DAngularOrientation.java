package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;





@Mapping("AVAudio3DAngularOrientation")
public class AVAudio3DAngularOrientation 
    extends Struct 
     {

    
    protected AVAudio3DAngularOrientation() {}
    
    
    @DotMapping("yaw")
    public native float getYaw();
    @DotMapping("pitch")
    public native float getPitch();
    @DotMapping("roll")
    public native float getRoll();
    
    public static native AVAudio3DAngularOrientation create(float yaw, float pitch, float roll) /*-[
        AVAudio3DAngularOrientation __new = { .yaw = yaw, .pitch = pitch, .roll = roll };
        return __new;
    ]-*/;
    public static native AVAudio3DAngularOrientation copyWithyaw(AVAudio3DAngularOrientation original, float yaw) /*-[
        original.yaw = yaw;
        return __new;
    ]-*/;

    
    public static native AVAudio3DAngularOrientation copyWithpitch(AVAudio3DAngularOrientation original, float pitch) /*-[
        original.pitch = pitch;
        return __new;
    ]-*/;

    
    public static native AVAudio3DAngularOrientation copyWithroll(AVAudio3DAngularOrientation original, float roll) /*-[
        original.roll = roll;
        return __new;
    ]-*/;

    
}
