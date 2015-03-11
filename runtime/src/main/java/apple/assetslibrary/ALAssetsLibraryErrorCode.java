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





@Library("AssetsLibrary")
@Mapping("ALAssetsLibraryErrorCode")
public final class ALAssetsLibraryErrorCode extends ObjCEnum {
    
    @GlobalConstant("ALAssetsLibraryUnknownError")
    public static final long Unknown = -1L;
    @GlobalConstant("ALAssetsLibraryWriteFailedError")
    public static final long WriteFailed = -3300L;
    @GlobalConstant("ALAssetsLibraryWriteBusyError")
    public static final long WriteBusy = -3301L;
    @GlobalConstant("ALAssetsLibraryWriteInvalidDataError")
    public static final long WriteInvalidData = -3302L;
    @GlobalConstant("ALAssetsLibraryWriteIncompatibleDataError")
    public static final long WriteIncompatibleData = -3303L;
    @GlobalConstant("ALAssetsLibraryWriteDataEncodingError")
    public static final long WriteDataEncoding = -3304L;
    @GlobalConstant("ALAssetsLibraryWriteDiskSpaceError")
    public static final long WriteDiskSpace = -3305L;
    @GlobalConstant("ALAssetsLibraryDataUnavailableError")
    public static final long DataUnavailable = -3310L;
    @GlobalConstant("ALAssetsLibraryAccessUserDeniedError")
    public static final long AccessUserDenied = -3311L;
    @GlobalConstant("ALAssetsLibraryAccessGloballyDeniedError")
    public static final long AccessGloballyDenied = -3312L;
    

}
