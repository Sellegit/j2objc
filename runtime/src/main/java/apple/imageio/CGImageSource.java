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
    public native String getType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetCount")
    public native @MachineSizedUInt long getCount();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCopyProperties")
    public native CGImageProperties getProperties(NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCopyPropertiesAtIndex")
    public native CGImageProperties getProperties(@MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageSourceCopyMetadataAtIndex")
    public native CGImageMetadata getMetadata(@MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateImageAtIndex")
    public native CGImage createImage(@MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageSourceRemoveCacheAtIndex")
    public native void removeCache(@MachineSizedUInt long index);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateThumbnailAtIndex")
    public native CGImage createThumbnail(@MachineSizedUInt long index, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceCreateIncremental")
    public static native CGImageSource createIncremental(NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceUpdateData")
    public native void updateData(NSData data, boolean isFinal);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceUpdateDataProvider")
    public native void updateDataProvider(CGDataProvider provider, boolean isFinal);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetStatus")
    public native CGImageSourceStatus getStatus();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageSourceGetStatusAtIndex")
    public native CGImageSourceStatus getStatus(@MachineSizedUInt long index);
    
}
