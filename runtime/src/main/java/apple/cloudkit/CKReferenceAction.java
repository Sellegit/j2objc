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

@Library("CloudKit/CloudKit.h")
@Mapping("CKReferenceAction")
public final class CKReferenceAction extends ObjCEnum {
    
    @GlobalConstant("CKReferenceActionNone")
    public static final long None = 0L;
    @GlobalConstant("CKReferenceActionDeleteSelf")
    public static final long DeleteSelf = 1L;
    

}
