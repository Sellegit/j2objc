package apple.coreimage;


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
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;





@Library("CoreImage") @Mapping("CIFilter")
public class CIFilter 
    extends NSObject 
    implements NSCoding, NSCopying {

    
    
    
    
    
    @Mapping("outputImage")
    public native CIImage getOutputImage();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("name")
    public native String getName();
    @Mapping("inputKeys")
    public native List<String> getInputKeys();
    @Mapping("outputKeys")
    public native List<String> getOutputKeys();
    @Mapping("setDefaults")
    public native void setDefaults();
    @Mapping("attributes")
    public native CIFilterAttributes getAttributes();
    @Mapping("filterWithName:")
    public static native CIFilter create(String name);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("filterWithName:withInputParameters:")
    public static native CIFilter create(String name, NSDictionary<?, ?> params);
    @Mapping("filterNamesInCategory:")
    public static native List<String> getFilterNames(String category);
    @Mapping("filterNamesInCategories:")
    public static native List<String> getFilterNames(NSArray<?> categories);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("serializedXMPFromFilters:inputImageExtent:")
    public static native NSData serializeToXMP(NSArray<?> filters, CGRect extent);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("filterArrayFromSerializedXMP:inputImageExtent:error:")
    protected static native NSArray<CIFilter> deserializeFromXMP(NSData xmpData, CGRect extent, Todo outError);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
