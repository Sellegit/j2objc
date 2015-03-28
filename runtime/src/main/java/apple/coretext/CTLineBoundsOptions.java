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
@Mapping("CTLineBoundsOptions")
public final class CTLineBoundsOptions extends ObjCEnum {
    
    @GlobalConstant("kCTLineBoundsExcludeTypographicLeading")
    public static final long ExcludeTypographicLeading = 1L;
    @GlobalConstant("kCTLineBoundsExcludeTypographicShifts")
    public static final long ExcludeTypographicShifts = 2L;
    @GlobalConstant("kCTLineBoundsUseHangingPunctuation")
    public static final long UseHangingPunctuation = 4L;
    @GlobalConstant("kCTLineBoundsUseGlyphPathBounds")
    public static final long UseGlyphPathBounds = 8L;
    @GlobalConstant("kCTLineBoundsUseOpticalBounds")
    public static final long UseOpticalBounds = 16L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCTLineBoundsIncludeLanguageExtents")
    public static final long IncludeLanguageExtents = 32L;


}
