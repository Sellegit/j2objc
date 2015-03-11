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



/**
 * @since Available in iOS 7.0 and later.
 */


@Mapping("AVAudioSessionErrorCode")
public final class AVAudioSessionErrorCode extends ObjCEnum {
    
    @GlobalConstant("AVAudioSessionErrorCodeNone")
    public static final long CodeNone = 0L;
    @GlobalConstant("AVAudioSessionErrorCodeMediaServicesFailed")
    public static final long CodeMediaServicesFailed = 1836282486L;
    @GlobalConstant("AVAudioSessionErrorCodeIsBusy")
    public static final long CodeIsBusy = 560030580L;
    @GlobalConstant("AVAudioSessionErrorCodeIncompatibleCategory")
    public static final long CodeIncompatibleCategory = 560161140L;
    @GlobalConstant("AVAudioSessionErrorCodeCannotInterruptOthers")
    public static final long CodeCannotInterruptOthers = 560557684L;
    @GlobalConstant("AVAudioSessionErrorCodeMissingEntitlement")
    public static final long CodeMissingEntitlement = 1701737535L;
    @GlobalConstant("AVAudioSessionErrorCodeSiriIsRecording")
    public static final long CodeSiriIsRecording = 1936290409L;
    @GlobalConstant("AVAudioSessionErrorCodeCannotStartPlaying")
    public static final long CodeCannotStartPlaying = 561015905L;
    @GlobalConstant("AVAudioSessionErrorCodeCannotStartRecording")
    public static final long CodeCannotStartRecording = 561145187L;
    @GlobalConstant("AVAudioSessionErrorCodeBadParam")
    public static final long CodeBadParam = -50L;
    @GlobalConstant("AVAudioSessionErrorInsufficientPriority")
    public static final long InsufficientPriority = 561017449L;
    @GlobalConstant("AVAudioSessionErrorCodeUnspecified")
    public static final long CodeUnspecified = 2003329396L;
    

}
