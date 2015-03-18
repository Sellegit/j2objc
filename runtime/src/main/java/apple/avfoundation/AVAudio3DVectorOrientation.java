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





@Mapping("AVAudio3DVectorOrientation") @Library("AVFoundation/AVFoundation.h")
public class AVAudio3DVectorOrientation 
    extends Struct 
     {

    
    private AVAudio3DVectorOrientation() {}
    
    
    @DotMapping("forward")
    public native AVAudio3DVector getForward();
    @DotMapping("up")
    public native AVAudio3DVector getUp();
    
    public static native AVAudio3DVectorOrientation create(AVAudio3DVector forward, AVAudio3DVector up) /*-[
        AVAudio3DVectorOrientation __new = { .forward = forward, .up = up };
        return __new;
    ]-*/;
    public static native AVAudio3DVectorOrientation copyWithforward(AVAudio3DVectorOrientation original, AVAudio3DVector forward) /*-[
        AVAudio3DVectorOrientation __new = { .forward = forward, .up = original.up };
        return __new;
    ]-*/;

    
    public static native AVAudio3DVectorOrientation copyWithup(AVAudio3DVectorOrientation original, AVAudio3DVector up) /*-[
        AVAudio3DVectorOrientation __new = { .forward = original.forward, .up = up };
        return __new;
    ]-*/;

    
}
