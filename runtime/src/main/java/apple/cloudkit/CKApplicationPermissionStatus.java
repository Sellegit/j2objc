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
@Mapping("CKApplicationPermissionStatus")
public final class CKApplicationPermissionStatus extends ObjCEnum {
    
    @GlobalConstant("CKApplicationPermissionStatusInitialState")
    public static final long InitialState = 0L;
    @GlobalConstant("CKApplicationPermissionStatusCouldNotComplete")
    public static final long CouldNotComplete = 1L;
    @GlobalConstant("CKApplicationPermissionStatusDenied")
    public static final long Denied = 2L;
    @GlobalConstant("CKApplicationPermissionStatusGranted")
    public static final long Granted = 3L;
    

}
