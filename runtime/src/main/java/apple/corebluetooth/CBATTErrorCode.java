package apple.corebluetooth;


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





@Library("CoreBluetooth")
@Mapping("CBATTErrorCode")
public final class CBATTErrorCode extends ObjCEnum {
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBATTErrorSuccess")
    public static final long Success = 0L;
    @GlobalConstant("CBATTErrorInvalidHandle")
    public static final long InvalidHandle = 1L;
    @GlobalConstant("CBATTErrorReadNotPermitted")
    public static final long ReadNotPermitted = 2L;
    @GlobalConstant("CBATTErrorWriteNotPermitted")
    public static final long WriteNotPermitted = 3L;
    @GlobalConstant("CBATTErrorInvalidPdu")
    public static final long InvalidPdu = 4L;
    @GlobalConstant("CBATTErrorInsufficientAuthentication")
    public static final long InsufficientAuthentication = 5L;
    @GlobalConstant("CBATTErrorRequestNotSupported")
    public static final long RequestNotSupported = 6L;
    @GlobalConstant("CBATTErrorInvalidOffset")
    public static final long InvalidOffset = 7L;
    @GlobalConstant("CBATTErrorInsufficientAuthorization")
    public static final long InsufficientAuthorization = 8L;
    @GlobalConstant("CBATTErrorPrepareQueueFull")
    public static final long PrepareQueueFull = 9L;
    @GlobalConstant("CBATTErrorAttributeNotFound")
    public static final long AttributeNotFound = 10L;
    @GlobalConstant("CBATTErrorAttributeNotLong")
    public static final long AttributeNotLong = 11L;
    @GlobalConstant("CBATTErrorInsufficientEncryptionKeySize")
    public static final long InsufficientEncryptionKeySize = 12L;
    @GlobalConstant("CBATTErrorInvalidAttributeValueLength")
    public static final long InvalidAttributeValueLength = 13L;
    @GlobalConstant("CBATTErrorUnlikelyError")
    public static final long UnlikelyError = 14L;
    @GlobalConstant("CBATTErrorInsufficientEncryption")
    public static final long InsufficientEncryption = 15L;
    @GlobalConstant("CBATTErrorUnsupportedGroupType")
    public static final long UnsupportedGroupType = 16L;
    @GlobalConstant("CBATTErrorInsufficientResources")
    public static final long InsufficientResources = 17L;
    

}
