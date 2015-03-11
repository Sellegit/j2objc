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
 * @since Available in iOS 8.0 and later.
 */


@Mapping("AVAudioSessionRecordPermission")
public final class AVAudioSessionRecordPermission extends ObjCEnum {
    
    @GlobalConstant("AVAudioSessionRecordPermissionUndetermined")
    public static final long Undetermined = 1970168948L;
    @GlobalConstant("AVAudioSessionRecordPermissionDenied")
    public static final long Denied = 1684369017L;
    @GlobalConstant("AVAudioSessionRecordPermissionGranted")
    public static final long Granted = 1735552628L;
    

}
