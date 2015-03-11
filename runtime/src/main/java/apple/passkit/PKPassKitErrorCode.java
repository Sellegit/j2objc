package apple.passkit;


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
import apple.uikit.*;
import apple.addressbook.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("PassKit")
@Mapping("PKPassKitErrorCode")
public final class PKPassKitErrorCode extends ObjCEnum {
    
    @GlobalConstant("PKUnknownError")
    public static final long UnknownError = -1L;
    @GlobalConstant("PKInvalidDataError")
    public static final long InvalidDataError = 1L;
    @GlobalConstant("PKUnsupportedVersionError")
    public static final long UnsupportedVersionError = 2L;
    @GlobalConstant("PKInvalidSignature")
    public static final long InvalidSignature = 3L;
    @GlobalConstant("PKNotEntitledError")
    public static final long NotEntitledError = 4L;
    

}
