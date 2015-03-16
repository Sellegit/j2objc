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





@Library("CoreText/CoreText.h")
@Mapping("CTFontDescriptorMatchingState")
public final class CTFontDescriptorMatchingState extends ObjCEnum {
    
    @GlobalConstant("kCTFontDescriptorMatchingDidBegin")
    public static final long DidBegin = 0L;
    @GlobalConstant("kCTFontDescriptorMatchingDidFinish")
    public static final long DidFinish = 1L;
    @GlobalConstant("kCTFontDescriptorMatchingWillBeginQuerying")
    public static final long WillBeginQuerying = 2L;
    @GlobalConstant("kCTFontDescriptorMatchingStalled")
    public static final long Stalled = 3L;
    @GlobalConstant("kCTFontDescriptorMatchingWillBeginDownloading")
    public static final long WillBeginDownloading = 4L;
    @GlobalConstant("kCTFontDescriptorMatchingDownloading")
    public static final long Downloading = 5L;
    @GlobalConstant("kCTFontDescriptorMatchingDidFinishDownloading")
    public static final long DidFinishDownloading = 6L;
    @GlobalConstant("kCTFontDescriptorMatchingDidMatch")
    public static final long DidMatch = 7L;
    @GlobalConstant("kCTFontDescriptorMatchingDidFailWithError")
    public static final long DidFailWithError = 8L;
    

}
