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





@Mapping("MIDINoteMessage")
public class MIDINoteMessage 
    extends Struct 
     {

    
    protected MIDINoteMessage() {}
    
    
    @DotMapping("channel")
    public native byte getChannel();
    @DotMapping("note")
    public native byte getNote();
    @DotMapping("velocity")
    public native byte getVelocity();
    @DotMapping("releaseVelocity")
    public native byte getReleaseVelocity();
    @DotMapping("duration")
    public native float getDuration();
    
    public static native MIDINoteMessage create(byte channel, byte note, byte velocity, byte releaseVelocity, float duration) /*-[
        MIDINoteMessage __new = { .channel = channel, .note = note, .velocity = velocity, .releaseVelocity = releaseVelocity, .duration = duration };
        return __new;
    ]-*/;
    public static native MIDINoteMessage copyWithchannel(MIDINoteMessage original, byte channel) /*-[
        original.channel = channel;
        return __new;
    ]-*/;

    
    public static native MIDINoteMessage copyWithnote(MIDINoteMessage original, byte note) /*-[
        original.note = note;
        return __new;
    ]-*/;

    
    public static native MIDINoteMessage copyWithvelocity(MIDINoteMessage original, byte velocity) /*-[
        original.velocity = velocity;
        return __new;
    ]-*/;

    
    public static native MIDINoteMessage copyWithreleaseVelocity(MIDINoteMessage original, byte releaseVelocity) /*-[
        original.releaseVelocity = releaseVelocity;
        return __new;
    ]-*/;

    
    public static native MIDINoteMessage copyWithduration(MIDINoteMessage original, float duration) /*-[
        original.duration = duration;
        return __new;
    ]-*/;

    
}
