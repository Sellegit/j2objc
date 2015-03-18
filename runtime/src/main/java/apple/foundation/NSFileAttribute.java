package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSFileAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSFileType")
    public static native NSString TypeAttribute();
    @GlobalConstant("NSFileSize")
    public static native NSString SizeAttribute();
    @GlobalConstant("NSFileModificationDate")
    public static native NSString ModificationDateAttribute();
    @GlobalConstant("NSFileReferenceCount")
    public static native NSString ReferenceCountAttribute();
    @GlobalConstant("NSFileDeviceIdentifier")
    public static native NSString DeviceIdentifierAttribute();
    @GlobalConstant("NSFileOwnerAccountName")
    public static native NSString OwnerAccountNameAttribute();
    @GlobalConstant("NSFileGroupOwnerAccountName")
    public static native NSString GroupOwnerAccountNameAttribute();
    @GlobalConstant("NSFilePosixPermissions")
    public static native NSString PosixPermissionsAttribute();
    @GlobalConstant("NSFileSystemFileNumber")
    public static native NSString SystemFileNumberAttribute();
    @GlobalConstant("NSFileExtensionHidden")
    public static native NSString ExtensionHiddenAttribute();
    @GlobalConstant("NSFileHFSCreatorCode")
    public static native NSString HFSCreatorCodeAttribute();
    @GlobalConstant("NSFileHFSTypeCode")
    public static native NSString HFSTypeCodeAttribute();
    @GlobalConstant("NSFileImmutable")
    public static native NSString ImmutableAttribute();
    @GlobalConstant("NSFileAppendOnly")
    public static native NSString AppendOnlyAttribute();
    @GlobalConstant("NSFileCreationDate")
    public static native NSString CreationDateAttribute();
    @GlobalConstant("NSFileOwnerAccountID")
    public static native NSString OwnerAccountIDAttribute();
    @GlobalConstant("NSFileGroupOwnerAccountID")
    public static native NSString GroupOwnerAccountIDAttribute();
    @GlobalConstant("NSFileBusy")
    public static native NSString BusyAttribute();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSFileProtectionKey")
    public static native NSString ProtectionKeyAttribute();
    
}
