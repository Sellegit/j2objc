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
public class CGImageDestinationProperties 
    extends CGImageProperties 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageDestinationLossyCompressionQuality")
    public static native CFString LossyCompressionQualityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageDestinationBackgroundColor")
    public static native CFString BackgroundColorKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImageDestinationImageMaxPixelSize")
    public static native CFString ImageMaxPixelSizeKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImageDestinationEmbedThumbnail")
    public static native CFString EmbedThumbnailKey();

}
