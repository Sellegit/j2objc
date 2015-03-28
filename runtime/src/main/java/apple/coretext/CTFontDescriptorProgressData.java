package apple.coretext;


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
@Library("CoreText/CoreText.h")
public class CTFontDescriptorProgressData 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingSourceDescriptor")
    public static native CFString SourceDescriptor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingDescriptors")
    public static native CFString Descriptors();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingResult")
    public static native CFString Result();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingPercentage")
    public static native CFString Percentage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingCurrentAssetSize")
    public static native CFString CurrentAssetSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingTotalDownloadedSize")
    public static native CFString TotalDownloadedSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingTotalAssetSize")
    public static native CFString TotalAssetSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingError")
    public static native CFString Error();

}
