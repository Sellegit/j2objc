package apple.coredata;


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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("CoreData/CoreData.h") @Mapping("NSMergePolicy")
public class NSMergePolicy 
    extends NSObject 
     {

    
    
    public NSMergePolicy() {}
    @Mapping("initWithMergeType:")
    public NSMergePolicy(@Representing("NSMergePolicyType") @MachineSizedUInt long ty) { }
    
    
    @Mapping("mergeType")
    public native @Representing("NSMergePolicyType") @MachineSizedUInt long getMergeType();
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSErrorMergePolicy")
    public static native NSMergePolicy getErrorMergePolicy();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMergeByPropertyStoreTrumpMergePolicy")
    public static native NSMergePolicy getMergeByPropertyStoreTrumpMergePolicy();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMergeByPropertyObjectTrumpMergePolicy")
    public static native NSMergePolicy getMergeByPropertyObjectTrumpMergePolicy();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSOverwriteMergePolicy")
    public static native NSMergePolicy getOverwriteMergePolicy();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSRollbackMergePolicy")
    public static native NSMergePolicy getRollbackMergePolicy();
    
    @Mapping("resolveConflicts:error:")
    protected native boolean resolveConflicts(NSArray<?> list, Todo error);
    
}
