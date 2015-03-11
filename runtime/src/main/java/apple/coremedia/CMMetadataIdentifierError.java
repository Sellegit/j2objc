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





@Library("CoreMedia")
@Mapping("CMMetadataIdentifierError")
public final class CMMetadataIdentifierError extends ObjCEnum {
    
    @GlobalConstant("kCMMetadataIdentifierError_AllocationFailed")
    public static final long AllocationFailed = -16300L;
    @GlobalConstant("kCMMetadataIdentifierError_RequiredParameterMissing")
    public static final long RequiredParameterMissing = -16301L;
    @GlobalConstant("kCMMetadataIdentifierError_BadKey")
    public static final long BadKey = -16302L;
    @GlobalConstant("kCMMetadataIdentifierError_BadKeyLength")
    public static final long BadKeyLength = -16303L;
    @GlobalConstant("kCMMetadataIdentifierError_BadKeyType")
    public static final long BadKeyType = -16304L;
    @GlobalConstant("kCMMetadataIdentifierError_BadNumberKey")
    public static final long BadNumberKey = -16305L;
    @GlobalConstant("kCMMetadataIdentifierError_BadKeySpace")
    public static final long BadKeySpace = -16306L;
    @GlobalConstant("kCMMetadataIdentifierError_BadIdentifier")
    public static final long BadIdentifier = -16307L;
    @GlobalConstant("kCMMetadataIdentifierError_NoKeyValueAvailable")
    public static final long NoKeyValueAvailable = -16308L;
    

}
