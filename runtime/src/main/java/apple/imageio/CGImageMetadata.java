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
@Mapping("CGImageMetadataRef") @Library("ImageIO/ImageIO.h")
public class CGImageMetadata 
    extends CFType 
     {

    
    
    protected CGImageMetadata() {}

    
    
    
    @GlobalFunction("CGImageMetadataGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCreateMutable")
    public static native CGImageMetadata create();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCreateMutableCopy")
    public static native CGImageMetadata createCopy(CGImageMetadata metadata);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCopyTags")
    public static native List<CGImageMetadataTag> getTags(CGImageMetadata metadata);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCopyTagWithPath")
    public static native CGImageMetadataTag getTagAtPath(CGImageMetadata metadata, CGImageMetadataTag parent, CFString path);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCopyStringValueWithPath")
    public static native CFString getStringValueAtPath(CGImageMetadata metadata, CGImageMetadataTag parent, CFString path);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataRegisterNamespaceForPrefix")
    public static native boolean registerNamespaceForPrefix(CGImageMetadata metadata, CFString xmlns, CFString prefix, Todo err);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataSetTagWithPath")
    public static native boolean setTagAtPath(CGImageMetadata metadata, CGImageMetadataTag parent, CFString path, CGImageMetadataTag tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataSetValueWithPath")
    public static native boolean setValueAtPath(CGImageMetadata metadata, CGImageMetadataTag parent, CFString path, CFType value);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataRemoveTagWithPath")
    public static native boolean removeTagAtPath(CGImageMetadata metadata, CGImageMetadataTag parent, CFString path);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataEnumerateTagsUsingBlock")
    public static native void enumerateTags(CGImageMetadata metadata, CFString rootPath, CFDictionary options, FunctionPtr block);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCreateXMPData")
    public static native CFData createXMPData(CGImageMetadata metadata, CFDictionary options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCreateFromXMPData")
    public static native CGImageMetadata createFromXMPData(CFData data);

}
