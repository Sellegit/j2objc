package apple.imageio;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("ImageIO")
public class CGImageMetadataTag 
    extends CFType 
     {

    
    
    protected CGImageMetadataTag() {}
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCreate")
    public static native CGImageMetadataTag create(String xmlns, String prefix, String name, CGImageMetadataType type, CFType value);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyNamespace")
    public native String getNamespace();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyPrefix")
    public native String getPrefix();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyName")
    public native String getName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyValue")
    public native CFType getValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagGetType")
    public native CGImageMetadataType getType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyQualifiers")
    public native List<String> getQualifiers();
    
}
