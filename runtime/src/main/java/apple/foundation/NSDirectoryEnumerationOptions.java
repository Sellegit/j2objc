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


@Mapping("NSDirectoryEnumerationOptions")
public final class NSDirectoryEnumerationOptions extends ObjCEnum {
    
    @GlobalConstant("NSDirectoryEnumerationSkipsSubdirectoryDescendants")
    public static final long SubdirectoryDescendants = 1L;
    @GlobalConstant("NSDirectoryEnumerationSkipsPackageDescendants")
    public static final long PackageDescendants = 2L;
    @GlobalConstant("NSDirectoryEnumerationSkipsHiddenFiles")
    public static final long HiddenFiles = 4L;
    

}
