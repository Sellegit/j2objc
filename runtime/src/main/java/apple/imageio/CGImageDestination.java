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
public class CGImageDestination 
    extends CFType 
     {

    
    
    protected CGImageDestination() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationCopyTypeIdentifiers")
    public static native List<String> getTypeIdentifiers();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationCreateWithDataConsumer")
    public static native CGImageDestination create(CGDataConsumer consumer, String type, @MachineSizedUInt long count, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationCreateWithData")
    public static native CGImageDestination create(NSData data, String type, @MachineSizedUInt long count, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationCreateWithURL")
    public static native CGImageDestination create(NSURL url, String type, @MachineSizedUInt long count, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationSetProperties")
    public static native void setProperties(CGImageDestination idst, NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationAddImage")
    public static native void addImage(CGImageDestination idst, CGImage image, NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationAddImageFromSource")
    public static native void addImageFromSource(CGImageDestination idst, CGImageSource isrc, @MachineSizedUInt long index, NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageDestinationAddImageAndMetadata")
    public static native void addImageAndMetadata(CGImageDestination idst, CGImage image, CGImageMetadata metadata, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageDestinationCopyImageSource")
    public static native boolean copyImageSource(CGImageDestination idst, CGImageSource isrc, NSDictionary<?, ?> options, Todo err);
    
}
