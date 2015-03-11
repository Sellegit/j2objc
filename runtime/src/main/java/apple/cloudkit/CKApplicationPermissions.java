package apple.cloudkit;


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
import apple.corelocation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CloudKit")
@Mapping("CKApplicationPermissions")
public final class CKApplicationPermissions extends ObjCEnum {
    
    @GlobalConstant("CKApplicationPermissionUserDiscoverability")
    public static final long UserDiscoverability = 1L;
    

}
