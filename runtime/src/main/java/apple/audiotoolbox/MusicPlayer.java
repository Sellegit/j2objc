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

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("NewMusicPlayer")
    public static native int create(Todo outPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("DisposeMusicPlayer")
    public static native int dispose(OpaqueMusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetSequence")
    public static native int setSequence(OpaqueMusicPlayer inPlayer, OpaqueMusicSequence inSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetSequence")
    public static native int getSequence(OpaqueMusicPlayer inPlayer, Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetTime")
    public static native int setTime(OpaqueMusicPlayer inPlayer, double inTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetTime")
    public static native int getTime(OpaqueMusicPlayer inPlayer, Todo outTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetHostTimeForBeats")
    public static native int getHostTimeForBeats(OpaqueMusicPlayer inPlayer, double inBeats, Todo outHostTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetBeatsForHostTime")
    public static native int getBeatsForHostTime(OpaqueMusicPlayer inPlayer, long inHostTime, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerPreroll")
    public static native int preroll(OpaqueMusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerStart")
    public static native int start(OpaqueMusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerStop")
    public static native int stop(OpaqueMusicPlayer inPlayer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerIsPlaying")
    public static native int isPlaying(OpaqueMusicPlayer inPlayer, Todo outIsPlaying);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetPlayRateScalar")
    public static native int setPlayRateScalar(OpaqueMusicPlayer inPlayer, double inScaleRate);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetPlayRateScalar")
    public static native int getPlayRateScalar(OpaqueMusicPlayer inPlayer, Todo outScaleRate);
    
}
