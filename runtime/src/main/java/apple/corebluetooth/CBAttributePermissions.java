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



/**
 * @since Available in iOS 6.0 and later.
 */


@Mapping("CBAttributePermissions")
public final class CBAttributePermissions extends ObjCEnum {
    
    @GlobalConstant("CBAttributePermissionsReadable")
    public static final long Readable = 1L;
    @GlobalConstant("CBAttributePermissionsWriteable")
    public static final long Writeable = 2L;
    @GlobalConstant("CBAttributePermissionsReadEncryptionRequired")
    public static final long ReadEncryptionRequired = 4L;
    @GlobalConstant("CBAttributePermissionsWriteEncryptionRequired")
    public static final long WriteEncryptionRequired = 8L;
    

}
