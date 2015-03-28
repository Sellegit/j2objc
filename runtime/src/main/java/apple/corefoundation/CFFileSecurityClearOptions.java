package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFFileSecurityClearOptions")
public final class CFFileSecurityClearOptions extends ObjCEnum {
    
    @GlobalConstant("kCFFileSecurityClearOwner")
    public static final long Owner = 1L;
    @GlobalConstant("kCFFileSecurityClearGroup")
    public static final long Group = 2L;
    @GlobalConstant("kCFFileSecurityClearMode")
    public static final long Mode = 4L;
    @GlobalConstant("kCFFileSecurityClearOwnerUUID")
    public static final long OwnerUUID = 8L;
    @GlobalConstant("kCFFileSecurityClearGroupUUID")
    public static final long GroupUUID = 16L;
    @GlobalConstant("kCFFileSecurityClearAccessControlList")
    public static final long AccessControlList = 32L;


}
