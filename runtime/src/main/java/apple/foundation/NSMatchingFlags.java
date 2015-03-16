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





@Library("Foundation/Foundation.h")
@Mapping("NSMatchingFlags")
public final class NSMatchingFlags extends ObjCEnum {
    
    @GlobalConstant("NSMatchingProgress")
    public static final long Progress = 1L;
    @GlobalConstant("NSMatchingCompleted")
    public static final long Completed = 2L;
    @GlobalConstant("NSMatchingHitEnd")
    public static final long HitEnd = 4L;
    @GlobalConstant("NSMatchingRequiredEnd")
    public static final long RequiredEnd = 8L;
    @GlobalConstant("NSMatchingInternalError")
    public static final long InternalError = 16L;
    

}
