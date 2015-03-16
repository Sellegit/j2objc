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

@Library("AVFoundation/AVFoundation.h")
@Mapping("AVAuthorizationStatus")
public final class AVAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("AVAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("AVAuthorizationStatusRestricted")
    public static final long Restricted = 1L;
    @GlobalConstant("AVAuthorizationStatusDenied")
    public static final long Denied = 2L;
    @GlobalConstant("AVAuthorizationStatusAuthorized")
    public static final long Authorized = 3L;
    

}
