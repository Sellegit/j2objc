package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h") @Mapping("NSString")
public class NSString 
    extends NSObject 
    implements NSPropertyList {

    
    
    @Mapping("init")
    public NSString() { }
    @Mapping("initWithCoder:")
    public NSString(NSCoder aDecoder) { }
    @Mapping("initWithCharacters:length:")
    public NSString(Todo characters, @MachineSizedUInt long length) { }
    @Mapping("initWithUTF8String:")
    public NSString(Todo nullTerminatedCString) { }
    @Mapping("initWithString:")
    public NSString(String aString) { }
    @Mapping("initWithData:encoding:")
    public NSString(NSData data, @Representing("NSStringEncoding") long encoding) { }
    @Mapping("initWithBytes:length:encoding:")
    public NSString(Todo bytes, @MachineSizedUInt long len, @Representing("NSStringEncoding") long encoding) { }
    @Mapping("initWithContentsOfURL:encoding:error:")
    public NSString(NSURL url, @Representing("NSStringEncoding") long enc, Todo error) { }
    @Mapping("initWithContentsOfFile:encoding:error:")
    public NSString(String path, @Representing("NSStringEncoding") long enc, Todo error) { }
    @Mapping("initWithContentsOfURL:usedEncoding:error:")
    public NSString(NSURL url, Todo enc, Todo error) { }
    @Mapping("initWithContentsOfFile:usedEncoding:error:")
    public NSString(String path, Todo enc, Todo error) { }

    
    @Mapping("length")
    public native @MachineSizedUInt long length();
    @Mapping("doubleValue")
    public native double getDoubleValue();
    @Mapping("floatValue")
    public native float getFloatValue();
    @Mapping("intValue")
    public native int getIntValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("integerValue")
    public native @MachineSizedSInt long getIntegerValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("longLongValue")
    public native long getLongLongValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("boolValue")
    public native boolean isBoolValue();
    @Mapping("uppercaseString")
    public native String getUppercaseString();
    @Mapping("lowercaseString")
    public native String getLowercaseString();
    @Mapping("capitalizedString")
    public native String getCapitalizedString();
    @Mapping("description")
    public native String getDescription();
    @Mapping("hash")
    public native @MachineSizedUInt long getHash();
    @Mapping("fastestEncoding")
    public native @Representing("NSStringEncoding") long getFastestEncoding();
    @Mapping("smallestEncoding")
    public native @Representing("NSStringEncoding") long getSmallestEncoding();
    @Mapping("decomposedStringWithCanonicalMapping")
    public native String getDecomposedStringWithCanonicalMapping();
    @Mapping("precomposedStringWithCanonicalMapping")
    public native String getPrecomposedStringWithCanonicalMapping();
    @Mapping("decomposedStringWithCompatibilityMapping")
    public native String getDecomposedStringWithCompatibilityMapping();
    @Mapping("precomposedStringWithCompatibilityMapping")
    public native String getPrecomposedStringWithCompatibilityMapping();
    @Mapping("UTF8String")
    public native Todo getUTF8String();
    @Mapping("pathComponents")
    public native NSArray<?> getPathComponents();
    @Mapping("isAbsolutePath")
    public native boolean isAbsolutePath();
    @Mapping("lastPathComponent")
    public native String getLastPathComponent();
    @Mapping("stringByDeletingLastPathComponent")
    public native String getStringByDeletingLastPathComponent();
    @Mapping("pathExtension")
    public native String getPathExtension();
    @Mapping("stringByDeletingPathExtension")
    public native String getStringByDeletingPathExtension();
    @Mapping("stringByAbbreviatingWithTildeInPath")
    public native String getStringByAbbreviatingWithTildeInPath();
    @Mapping("stringByExpandingTildeInPath")
    public native String getStringByExpandingTildeInPath();
    @Mapping("stringByStandardizingPath")
    public native String getStringByStandardizingPath();
    @Mapping("stringByResolvingSymlinksInPath")
    public native String getStringByResolvingSymlinksInPath();
    @Mapping("fileSystemRepresentation")
    public native Todo getFileSystemRepresentation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("stringByRemovingPercentEncoding")
    public native String getStringByRemovingPercentEncoding();

    
    
    @Mapping("characterAtIndex:")
    public native short getCharactersAt(@MachineSizedUInt long index);
    @Mapping("getCharacters:range:")
    public native void getCharacters(Todo buffer, NSRange aRange);
    @Mapping("hasPrefix:")
    public native boolean hasPrefix(String aString);
    @Mapping("hasSuffix:")
    public native boolean hasSuffix(String aString);
    @Mapping("dataUsingEncoding:allowLossyConversion:")
    public native NSData toData(@Representing("NSStringEncoding") long encoding, boolean lossy);
    @Mapping("dataUsingEncoding:")
    public native NSData toData(@Representing("NSStringEncoding") long encoding);
    @Mapping("writeToURL:atomically:encoding:error:")
    public native boolean writeURL(NSURL url, boolean useAuxiliaryFile, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("writeToFile:atomically:encoding:error:")
    public native boolean writeFile(String path, boolean useAuxiliaryFile, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("stringWithContentsOfURL:encoding:error:")
    public static native String readURL(NSURL url, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("stringWithContentsOfFile:encoding:error:")
    public static native String readFile(String path, @Representing("NSStringEncoding") long enc, Todo error);
    @Mapping("stringByAppendingPathComponent:")
    public native String appendPathComponent(String str);
    @Mapping("stringByAppendingPathExtension:")
    public native String appendPathExtension(String str);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("stringByAddingPercentEncodingWithAllowedCharacters:")
    public native String addPercentEncoding(NSCharacterSet allowedCharacters);
    @Mapping("stringByAddingPercentEscapesUsingEncoding:")
    public native String addPercentEscapes(@Representing("NSStringEncoding") long enc);
    @Mapping("stringByReplacingPercentEscapesUsingEncoding:")
    public native String replacePercentEscapes(@Representing("NSStringEncoding") long enc);

}
