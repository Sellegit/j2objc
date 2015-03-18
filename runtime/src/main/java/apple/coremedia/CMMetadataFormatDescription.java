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
public class CMMetadataFormatDescription 
    extends CMFormatDescription 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateWithKeys")
    public static native int createWithKeys(CFAllocator allocator, CMMetadataFormatType metadataType, NSArray<?> keys, Todo outDesc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateWithMetadataSpecifications")
    public static native int createWithMetadataSpecifications(CFAllocator allocator, CMMetadataFormatType metadataType, NSArray<?> metadataSpecifications, Todo outDesc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateWithMetadataFormatDescriptionAndMetadataSpecifications")
    public static native int create(CFAllocator allocator, CMFormatDescription srcDesc, NSArray<?> metadataSpecifications, Todo outDesc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateByMergingMetadataFormatDescriptions")
    public static native int createByMergingFormatDescriptions(CFAllocator allocator, CMFormatDescription srcDesc1, CMFormatDescription srcDesc2, Todo outDesc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionGetKeyWithLocalID")
    public static native CMMetadataFormatDescriptionKey getKey(CMFormatDescription desc, int localKeyID);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionGetIdentifiers")
    public static native List<String> getIdentifiers(CMFormatDescription desc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionData")
    public static native int createFromBigEndianMetadataDescriptionData(CFAllocator allocator, Todo metadataDescriptionData, @MachineSizedUInt long metadataDescriptionSize, String metadataDescriptionFlavor, Todo metadataFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCreateFromBigEndianMetadataDescriptionBlockBuffer")
    public static native int createFromBigEndianMetadataDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer metadataDescriptionBlockBuffer, String metadataDescriptionFlavor, Todo metadataFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMMetadataFormatDescriptionCopyAsBigEndianMetadataDescriptionBlockBuffer")
    public static native int copyAsBigEndianMetadataDescriptionBlockBuffer(CFAllocator allocator, CMFormatDescription metadataFormatDescription, String metadataDescriptionFlavor, Todo metadataDescriptionBlockBufferOut);
    
}
