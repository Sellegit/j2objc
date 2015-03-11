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
@Library("Foundation")
public class NSFileAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSFileType")
    protected static native NSString TypeAttribute();
    @GlobalConstant("NSFileSize")
    protected static native NSString SizeAttribute();
    @GlobalConstant("NSFileModificationDate")
    protected static native NSString ModificationDateAttribute();
    @GlobalConstant("NSFileReferenceCount")
    protected static native NSString ReferenceCountAttribute();
    @GlobalConstant("NSFileDeviceIdentifier")
    protected static native NSString DeviceIdentifierAttribute();
    @GlobalConstant("NSFileOwnerAccountName")
    protected static native NSString OwnerAccountNameAttribute();
    @GlobalConstant("NSFileGroupOwnerAccountName")
    protected static native NSString GroupOwnerAccountNameAttribute();
    @GlobalConstant("NSFilePosixPermissions")
    protected static native NSString PosixPermissionsAttribute();
    @GlobalConstant("NSFileSystemFileNumber")
    protected static native NSString SystemFileNumberAttribute();
    @GlobalConstant("NSFileExtensionHidden")
    protected static native NSString ExtensionHiddenAttribute();
    @GlobalConstant("NSFileHFSCreatorCode")
    protected static native NSString HFSCreatorCodeAttribute();
    @GlobalConstant("NSFileHFSTypeCode")
    protected static native NSString HFSTypeCodeAttribute();
    @GlobalConstant("NSFileImmutable")
    protected static native NSString ImmutableAttribute();
    @GlobalConstant("NSFileAppendOnly")
    protected static native NSString AppendOnlyAttribute();
    @GlobalConstant("NSFileCreationDate")
    protected static native NSString CreationDateAttribute();
    @GlobalConstant("NSFileOwnerAccountID")
    protected static native NSString OwnerAccountIDAttribute();
    @GlobalConstant("NSFileGroupOwnerAccountID")
    protected static native NSString GroupOwnerAccountIDAttribute();
    @GlobalConstant("NSFileBusy")
    protected static native NSString BusyAttribute();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSFileProtectionKey")
    protected static native NSString ProtectionKeyAttribute();
    
}
