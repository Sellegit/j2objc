package apple.mediatoolbox;


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
import apple.coremedia.*;
import apple.coreaudio.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("MediaToolbox/MediaToolbox.h")
public class MTAudioProcessingTap 
    extends CFType 
     {

    
    public static final int CallbacksVersion = 0;
    
    
    protected MTAudioProcessingTap() {}
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("MTAudioProcessingTapGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("MTAudioProcessingTapCreate")
    protected static native int create(CFAllocator allocator, MTAudioProcessingTapCallbacksStruct callbacks, int flags, Todo tapOut);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("MTAudioProcessingTapGetStorage")
    public static native Todo getStorage(MTAudioProcessingTap tap);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("MTAudioProcessingTapGetSourceAudio")
    protected static native int getSourceAudio(MTAudioProcessingTap tap, @MachineSizedSInt long numberFrames, Todo bufferListInOut, Todo flagsOut, CMTimeRange timeRangeOut, Todo numberFramesOut);
    
}
