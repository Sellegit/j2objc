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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("Foundation")
@Mapping("NSFileManagerItemReplacementOptions")
public final class NSFileManagerItemReplacementOptions extends ObjCEnum {
    
    @GlobalConstant("NSFileManagerItemReplacementUsingNewMetadataOnly")
    public static final long UsingNewMetadataOnly = 1L;
    @GlobalConstant("NSFileManagerItemReplacementWithoutDeletingBackupItem")
    public static final long WithoutDeletingBackupItem = 2L;
    

}
