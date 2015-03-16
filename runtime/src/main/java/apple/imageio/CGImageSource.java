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
@Library("ImageIO/ImageIO.h")
public class CGImageSource 
    extends CFType 
     {

    
    
    protected CGImageSource() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCopyTypeIdentifiers")
    public static native List<String> getTypeIdentifiers();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateWithDataProvider")
    public static native CGImageSource create(CGDataProvider provider, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateWithData")
    public static native CGImageSource create(NSData data, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateWithURL")
    public static native CGImageSource create(NSURL url, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetType")
    public static native String getType(CGImageSource isrc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetCount")
    public static native @MachineSizedUInt long getCount(CGImageSource isrc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCopyProperties")
    public static native CGImageProperties getProperties(CGImageSource isrc, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCopyPropertiesAtIndex")
    public static native CGImageProperties getProperties(CGImageSource isrc, @MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageSourceCopyMetadataAtIndex")
    public static native CGImageMetadata getMetadata(CGImageSource isrc, @MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateImageAtIndex")
    public static native CGImage createImage(CGImageSource isrc, @MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageSourceRemoveCacheAtIndex")
    public static native void removeCache(CGImageSource isrc, @MachineSizedUInt long index);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateThumbnailAtIndex")
    public static native CGImage createThumbnail(CGImageSource isrc, @MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateIncremental")
    public static native CGImageSource createIncremental(NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceUpdateData")
    public static native void updateData(CGImageSource isrc, NSData data, boolean isFinal);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceUpdateDataProvider")
    public static native void updateDataProvider(CGImageSource isrc, CGDataProvider provider, boolean isFinal);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetStatus")
    public static native CGImageSourceStatus getStatus(CGImageSource isrc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetStatusAtIndex")
    public static native CGImageSourceStatus getStatus(CGImageSource isrc, @MachineSizedUInt long index);
    
}
