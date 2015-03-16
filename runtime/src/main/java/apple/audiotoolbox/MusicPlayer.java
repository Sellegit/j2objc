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


/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox/AudioToolbox.h")
public class MusicPlayer 
    extends Object 
     {

    
    
    protected MusicPlayer() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("NewMusicPlayer")
    public static native int create(Todo outPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("DisposeMusicPlayer")
    public static native int dispose(MusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetSequence")
    public static native int setSequence(MusicPlayer inPlayer, MusicSequence inSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetSequence")
    public static native int getSequence(MusicPlayer inPlayer, Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetTime")
    public static native int setTime(MusicPlayer inPlayer, double inTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetTime")
    public static native int getTime(MusicPlayer inPlayer, Todo outTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetHostTimeForBeats")
    public static native int getHostTimeForBeats(MusicPlayer inPlayer, double inBeats, Todo outHostTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetBeatsForHostTime")
    public static native int getBeatsForHostTime(MusicPlayer inPlayer, long inHostTime, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerPreroll")
    public static native int preroll(MusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerStart")
    public static native int start(MusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerStop")
    public static native int stop(MusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerIsPlaying")
    public static native int isPlaying(MusicPlayer inPlayer, Todo outIsPlaying);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetPlayRateScalar")
    public static native int setPlayRateScalar(MusicPlayer inPlayer, double inScaleRate);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetPlayRateScalar")
    public static native int getPlayRateScalar(MusicPlayer inPlayer, Todo outScaleRate);
    
}
