package apple.coremedia;


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
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMedia/CoreMedia.h")
public class CMMetadataDataType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryRegisterDataType")
    public static native CMMetadataDataTypeRegistryError registerDataType(CFString dataType, CFString description, CFArray conformingDataTypes);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryDataTypeIsRegistered")
    public static native boolean isDataTypeRegistered(CFString dataType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryGetDataTypeDescription")
    public static native CFString getDataTypeDescription(CFString dataType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryGetConformingDataTypes")
    public static native List<String> getConformingDataTypes(CFString dataType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryDataTypeConformsToDataType")
    public static native boolean doesDataTypeConformToDataType(CFString dataType, CFString conformsToDataType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryGetBaseDataTypes")
    public static native List<CMMetadataBaseDataType> getBaseDataTypes();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryDataTypeIsBaseDataType")
    public static native boolean isDataTypeBaseDataType(CFString dataType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataDataTypeRegistryGetBaseDataTypeForConformingDataType")
    public static native CMMetadataBaseDataType getBaseDataTypeForConformingDataType(CFString dataType);
    
}
