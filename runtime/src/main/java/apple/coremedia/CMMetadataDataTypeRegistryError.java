package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


@Library("CoreMedia/CoreMedia.h")
@Mapping("CMMetadataDataTypeRegistryError")
public final class CMMetadataDataTypeRegistryError extends ObjCEnum {
    
    @GlobalConstant("kCMMetadataDataTypeRegistryError_AllocationFailed")
    public static final long AllocationFailed = -16310L;
    @GlobalConstant("kCMMetadataDataTypeRegistryError_RequiredParameterMissing")
    public static final long RequiredParameterMissing = -16311L;
    @GlobalConstant("kCMMetadataDataTypeRegistryError_BadDataTypeIdentifier")
    public static final long BadDataTypeIdentifier = -16312L;
    @GlobalConstant("kCMMetadataDataTypeRegistryError_DataTypeAlreadyRegistered")
    public static final long DataTypeAlreadyRegistered = -16313L;
    @GlobalConstant("kCMMetadataDataTypeRegistryError_RequiresConformingBaseType")
    public static final long RequiresConformingBaseType = -16314L;
    @GlobalConstant("kCMMetadataDataTypeRegistryError_MultipleConformingBaseTypes")
    public static final long MultipleConformingBaseTypes = -16315L;


}
