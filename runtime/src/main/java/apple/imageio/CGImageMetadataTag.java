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
@Mapping("CGImageMetadataTagRef") @Library("ImageIO/ImageIO.h")
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
    public static native CGImageMetadataTag create(CFString xmlns, CFString prefix, CFString name, CGImageMetadataType type, CFType value);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyNamespace")
    public static native CFString getNamespace(CGImageMetadataTag tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyPrefix")
    public static native CFString getPrefix(CGImageMetadataTag tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyName")
    public static native CFString getName(CGImageMetadataTag tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyValue")
    public static native CFType getValue(CGImageMetadataTag tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagGetType")
    public static native CGImageMetadataType getType(CGImageMetadataTag tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataTagCopyQualifiers")
    public static native List<String> getQualifiers(CGImageMetadataTag tag);
    
}
