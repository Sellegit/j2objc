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
 * @since Available in iOS 3.0 and later.
 */

@Library("CoreData") @Mapping("NSPropertyDescription")
public class NSPropertyDescription 
    extends NSObject 
    implements NSCoding, NSCopying {

    
    
    public NSPropertyDescription() {}
    
    
    @Mapping("entity")
    public native NSEntityDescription getEntity();
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("isOptional")
    public native boolean isOptional();
    @Mapping("setOptional:")
    public native void setOptional(boolean v);
    @Mapping("isTransient")
    public native boolean isTransient();
    @Mapping("setTransient:")
    public native void setTransient(boolean v);
    @Mapping("validationPredicates")
    public native NSArray<NSPredicate> getValidationPredicates();
    @Mapping("validationWarnings")
    public native List<String> getValidationWarnings();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isIndexed")
    public native boolean isIndexed();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setIndexed:")
    public native void setIndexed(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("versionHash")
    public native NSData getVersionHash();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("versionHashModifier")
    public native String getVersionHashModifier();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setVersionHashModifier:")
    public native void setVersionHashModifier(String v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isIndexedBySpotlight")
    public native boolean isIndexedBySpotlight();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setIndexedBySpotlight:")
    public native void setIndexedBySpotlight(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isStoredInExternalRecord")
    public native boolean isStoredInExternalRecord();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setStoredInExternalRecord:")
    public native void setStoredInExternalRecord(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("renamingIdentifier")
    public native String getRenamingIdentifier();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setRenamingIdentifier:")
    public native void setRenamingIdentifier(String v);
    
    
    
    @Mapping("setValidationPredicates:withValidationWarnings:")
    public native void setValidationPredicatesAndWarnings(NSArray<?> validationPredicates, NSArray<?> validationWarnings);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
