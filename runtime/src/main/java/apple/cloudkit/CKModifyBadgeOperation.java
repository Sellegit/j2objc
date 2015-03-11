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

@Library("CloudKit") @Mapping("CKModifyBadgeOperation")
public class CKModifyBadgeOperation 
    extends CKOperation 
     {

    
    
    public CKModifyBadgeOperation() {}
    @Mapping("initWithBadgeValue:")
    public CKModifyBadgeOperation(@MachineSizedUInt long badgeValue) { }
    
    
    @Mapping("badgeValue")
    public native @MachineSizedUInt long getBadgeValue();
    @Mapping("setBadgeValue:")
    public native void setBadgeValue(@MachineSizedUInt long v);
    @Mapping("modifyBadgeCompletionBlock")
    public native @Block VoidBlock1<NSError> getModifyBadgeCompletionBlock();
    @Mapping("setModifyBadgeCompletionBlock:")
    public native void setModifyBadgeCompletionBlock(@Block VoidBlock1<NSError> v);
    
    
    
    
    
}
