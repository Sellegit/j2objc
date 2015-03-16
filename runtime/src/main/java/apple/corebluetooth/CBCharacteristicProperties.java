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





@Library("CoreBluetooth/CoreBluetooth.h")
@Mapping("CBCharacteristicProperties")
public final class CBCharacteristicProperties extends ObjCEnum {
    
    @GlobalConstant("CBCharacteristicPropertyBroadcast")
    public static final long Broadcast = 1L;
    @GlobalConstant("CBCharacteristicPropertyRead")
    public static final long Read = 2L;
    @GlobalConstant("CBCharacteristicPropertyWriteWithoutResponse")
    public static final long WriteWithoutResponse = 4L;
    @GlobalConstant("CBCharacteristicPropertyWrite")
    public static final long Write = 8L;
    @GlobalConstant("CBCharacteristicPropertyNotify")
    public static final long Notify = 16L;
    @GlobalConstant("CBCharacteristicPropertyIndicate")
    public static final long Indicate = 32L;
    @GlobalConstant("CBCharacteristicPropertyAuthenticatedSignedWrites")
    public static final long AuthenticatedSignedWrites = 64L;
    @GlobalConstant("CBCharacteristicPropertyExtendedProperties")
    public static final long ExtendedProperties = 128L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBCharacteristicPropertyNotifyEncryptionRequired")
    public static final long NotifyEncryptionRequired = 256L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBCharacteristicPropertyIndicateEncryptionRequired")
    public static final long IndicateEncryptionRequired = 512L;
    

}
