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
@Library("AudioToolbox")
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
    public native int dispose();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetSequence")
    public native int setSequence(MusicSequence inSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetSequence")
    public native int getSequence(Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetTime")
    public native int setTime(double inTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetTime")
    public native int getTime(Todo outTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetHostTimeForBeats")
    public native int getHostTimeForBeats(double inBeats, Todo outHostTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetBeatsForHostTime")
    public native int getBeatsForHostTime(long inHostTime, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerPreroll")
    public native int preroll();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerStart")
    public native int start();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerStop")
    public native int stop();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerIsPlaying")
    public native int isPlaying(Todo outIsPlaying);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerSetPlayRateScalar")
    public native int setPlayRateScalar(double inScaleRate);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicPlayerGetPlayRateScalar")
    public native int getPlayRateScalar(Todo outScaleRate);
    
}
