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
@Mapping("NSFileCoordinatorWritingOptions")
public final class NSFileCoordinatorWritingOptions extends ObjCEnum {
    
    @GlobalConstant("NSFileCoordinatorWritingForDeleting")
    public static final long ForDeleting = 1L;
    @GlobalConstant("NSFileCoordinatorWritingForMoving")
    public static final long ForMoving = 2L;
    @GlobalConstant("NSFileCoordinatorWritingForMerging")
    public static final long ForMerging = 4L;
    @GlobalConstant("NSFileCoordinatorWritingForReplacing")
    public static final long ForReplacing = 8L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSFileCoordinatorWritingContentIndependentMetadataOnly")
    public static final long ContentIndependentMetadataOnly = 16L;
    

}
