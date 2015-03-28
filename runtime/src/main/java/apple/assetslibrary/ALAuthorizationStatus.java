package apple.assetslibrary;


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
import apple.imageio.*;


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("AssetsLibrary/AssetsLibrary.h")
@Mapping("ALAuthorizationStatus")
public final class ALAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("ALAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("ALAuthorizationStatusRestricted")
    public static final long Restricted = 1L;
    @GlobalConstant("ALAuthorizationStatusDenied")
    public static final long Denied = 2L;
    @GlobalConstant("ALAuthorizationStatusAuthorized")
    public static final long Authorized = 3L;


}
