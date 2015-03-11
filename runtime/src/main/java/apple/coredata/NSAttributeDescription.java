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

@Library("CoreData") @Mapping("NSAttributeDescription")
public class NSAttributeDescription 
    extends NSPropertyDescription 
     {

    
    
    public NSAttributeDescription() {}
    
    
    @Mapping("attributeType")
    public native @Representing("NSAttributeType") @MachineSizedUInt long getAttributeType();
    public native void setAttributeType(@Representing("NSAttributeType") @MachineSizedUInt long v);
    @Mapping("attributeValueClassName")
    public native String getAttributeValueClassName();
    public native void setAttributeValueClassName(String v);
    @Mapping("defaultValue")
    public native Object getDefaultValue();
    public native void setDefaultValue(Object v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("versionHash")
    public native NSData getVersionHash();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("valueTransformerName")
    public native String getValueTransformerName();
    /**
     * @since Available in iOS 3.0 and later.
     */
    public native void setValueTransformerName(String v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("allowsExternalBinaryDataStorage")
    public native boolean allowsExternalBinaryDataStorage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native void setAllowsExternalBinaryDataStorage(boolean v);
    
    
    
    
    
}
