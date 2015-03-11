package apple.passkit;


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
import apple.uikit.*;
import apple.addressbook.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("PassKit")
@Mapping("PKPassLibraryAddPassesStatus")
public final class PKPassLibraryAddPassesStatus extends ObjCEnum {
    
    @GlobalConstant("PKPassLibraryDidAddPasses")
    public static final long DidAddPasses = 0L;
    @GlobalConstant("PKPassLibraryShouldReviewPasses")
    public static final long ShouldReviewPasses = 1L;
    @GlobalConstant("PKPassLibraryDidCancelAddPasses")
    public static final long DidCancelAddPasses = 2L;
    

}
