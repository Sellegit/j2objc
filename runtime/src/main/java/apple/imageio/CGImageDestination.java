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
    public native void setProperties(NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationAddImage")
    public native void addImage(CGImage image, NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGImageDestinationAddImageFromSource")
    public native void addImageFromSource(CGImageSource isrc, @MachineSizedUInt long index, NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageDestinationAddImageAndMetadata")
    public native void addImageAndMetadata(CGImage image, CGImageMetadata metadata, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGImageDestinationCopyImageSource")
    protected native boolean copyImageSource(CGImageSource isrc, NSDictionary<?, ?> options, Todo err);
    
}
