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
@Library("CoreText")
public class CTFontDescriptorProgressData 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingSourceDescriptor")
    protected static native CFString SourceDescriptor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingDescriptors")
    protected static native CFString Descriptors();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingResult")
    protected static native CFString Result();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingPercentage")
    protected static native CFString Percentage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingCurrentAssetSize")
    protected static native CFString CurrentAssetSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingTotalDownloadedSize")
    protected static native CFString TotalDownloadedSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingTotalAssetSize")
    protected static native CFString TotalAssetSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDescriptorMatchingError")
    protected static native CFString Error();
    
}
