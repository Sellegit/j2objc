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





@Mapping("MusicTrackLoopInfo") @Library("AudioToolbox/AudioToolbox.h")
public class MusicTrackLoopInfo 
    extends Struct 
     {

    
    protected MusicTrackLoopInfo() {}
    
    
    @DotMapping("loopDuration")
    public native double getLoopDuration();
    @DotMapping("numberOfLoops")
    public native int getNumberOfLoops();
    
    public static native MusicTrackLoopInfo create(double loopDuration, int numberOfLoops) /*-[
        MusicTrackLoopInfo __new = { .loopDuration = loopDuration, .numberOfLoops = numberOfLoops };
        return __new;
    ]-*/;
    public static native MusicTrackLoopInfo copyWithloopDuration(MusicTrackLoopInfo original, double loopDuration) /*-[
        MusicTrackLoopInfo __new = { .loopDuration = loopDuration, .numberOfLoops = original.numberOfLoops };
        return __new;
    ]-*/;

    
    public static native MusicTrackLoopInfo copyWithnumberOfLoops(MusicTrackLoopInfo original, int numberOfLoops) /*-[
        MusicTrackLoopInfo __new = { .loopDuration = original.loopDuration, .numberOfLoops = numberOfLoops };
        return __new;
    ]-*/;

    
}
