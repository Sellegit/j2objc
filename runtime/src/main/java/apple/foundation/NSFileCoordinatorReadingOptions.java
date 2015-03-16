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
@Mapping("NSFileCoordinatorReadingOptions")
public final class NSFileCoordinatorReadingOptions extends ObjCEnum {
    
    @GlobalConstant("NSFileCoordinatorReadingWithoutChanges")
    public static final long WithoutChanges = 1L;
    @GlobalConstant("NSFileCoordinatorReadingResolvesSymbolicLink")
    public static final long ResolvesSymbolicLink = 2L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSFileCoordinatorReadingImmediatelyAvailableMetadataOnly")
    public static final long ImmediatelyAvailableMetadataOnly = 4L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSFileCoordinatorReadingForUploading")
    public static final long ForUploading = 8L;
    

}
