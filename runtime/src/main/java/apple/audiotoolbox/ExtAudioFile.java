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
public class ExtAudioFile 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileOpenURL")
    public static native int openURL(CFURL inURL, Todo outExtAudioFile);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileWrapAudioFileID")
    public static native int wrapAudioFileID(AudioFile inFileID, boolean inForWriting, Todo outExtAudioFile);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileCreateWithURL")
    public static native int createWithURL(CFURL inURL, int inFileType, AudioStreamBasicDescription inStreamDesc, AudioChannelLayout inChannelLayout, int inFlags, Todo outExtAudioFile);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileRead")
    public static native int read(OpaqueExtAudioFile inExtAudioFile, Todo ioNumberFrames, Todo ioData);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileWrite")
    public static native int write(OpaqueExtAudioFile inExtAudioFile, int inNumberFrames, Todo ioData);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileWriteAsync")
    public static native int writeAsync(OpaqueExtAudioFile inExtAudioFile, int inNumberFrames, Todo ioData);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileSeek")
    public static native int seek(OpaqueExtAudioFile inExtAudioFile, long inFrameOffset);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileTell")
    public static native int tell(OpaqueExtAudioFile inExtAudioFile, Todo outFrameOffset);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileGetPropertyInfo")
    public static native int getPropertyInfo(OpaqueExtAudioFile inExtAudioFile, int inPropertyID, Todo outSize, Todo outWritable);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileGetProperty")
    public static native int getProperty(OpaqueExtAudioFile inExtAudioFile, int inPropertyID, Todo ioPropertyDataSize, Todo outPropertyData);
    /**
     * @since Available in iOS 2.1 and later.
     */
    @GlobalFunction("ExtAudioFileSetProperty")
    public static native int setProperty(OpaqueExtAudioFile inExtAudioFile, int inPropertyID, int inPropertyDataSize, Todo inPropertyData);
    
}
