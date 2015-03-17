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





@Mapping("AVAudio3DPoint") @Library("AVFoundation/AVFoundation.h")
public class AVAudio3DPoint 
    extends Struct 
     {

    
    protected AVAudio3DPoint() {}
    
    
    @DotMapping("x")
    public native float getX();
    @DotMapping("y")
    public native float getY();
    @DotMapping("z")
    public native float getZ();
    
    public static native AVAudio3DPoint create(float x, float y, float z) /*-[
        AVAudio3DPoint __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native AVAudio3DPoint copyWithx(AVAudio3DPoint original, float x) /*-[
        AVAudio3DPoint __new = { .x = x, .y = original.y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native AVAudio3DPoint copyWithy(AVAudio3DPoint original, float y) /*-[
        AVAudio3DPoint __new = { .x = original.x, .y = y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native AVAudio3DPoint copyWithz(AVAudio3DPoint original, float z) /*-[
        AVAudio3DPoint __new = { .x = original.x, .y = original.y, .z = z };
        return __new;
    ]-*/;

    
}
