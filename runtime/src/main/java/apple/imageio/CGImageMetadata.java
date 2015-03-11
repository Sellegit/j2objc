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
    public native List<CGImageMetadataTag> getTags();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCopyTagWithPath")
    public native CGImageMetadataTag getTagAtPath(CGImageMetadataTag parent, String path);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCopyStringValueWithPath")
    public native String getStringValueAtPath(CGImageMetadataTag parent, String path);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataRegisterNamespaceForPrefix")
    protected native boolean registerNamespaceForPrefix(String xmlns, String prefix, Todo err);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataSetTagWithPath")
    public native boolean setTagAtPath(CGImageMetadataTag parent, String path, CGImageMetadataTag tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataSetValueWithPath")
    public native boolean setValueAtPath(CGImageMetadataTag parent, String path, CFType value);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataRemoveTagWithPath")
    public native boolean removeTagAtPath(CGImageMetadataTag parent, String path);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataEnumerateTagsUsingBlock")
    public native void enumerateTags(String rootPath, CGImageMetadataEnumerationOptions options, @Block VoidBlock2<String, CGImageMetadataTag> block);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCreateXMPData")
    public native NSData createXMPData(NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageMetadataCreateFromXMPData")
    public static native CGImageMetadata createFromXMPData(NSData data);
    
}
