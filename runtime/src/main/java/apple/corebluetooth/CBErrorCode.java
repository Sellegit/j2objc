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
@Mapping("CBErrorCode")
public final class CBErrorCode extends ObjCEnum {
    
    @GlobalConstant("CBErrorUnknown")
    public static final long Unknown = 0L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorInvalidParameters")
    public static final long InvalidParameters = 1L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorInvalidHandle")
    public static final long InvalidHandle = 2L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorNotConnected")
    public static final long NotConnected = 3L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorOutOfSpace")
    public static final long OutOfSpace = 4L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorOperationCancelled")
    public static final long OperationCancelled = 5L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorConnectionTimeout")
    public static final long ConnectionTimeout = 6L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorPeripheralDisconnected")
    public static final long PeripheralDisconnected = 7L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorUUIDNotAllowed")
    public static final long UUIDNotAllowed = 8L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBErrorAlreadyAdvertising")
    public static final long AlreadyAdvertising = 9L;
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalConstant("CBErrorConnectionFailed")
    public static final long ConnectionFailed = 10L;
    

}
