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
@Mapping("CTParagraphStyleSpecifier")
public final class CTParagraphStyleSpecifier extends ObjCEnum {
    
    @GlobalConstant("kCTParagraphStyleSpecifierAlignment")
    public static final long Alignment = 0L;
    @GlobalConstant("kCTParagraphStyleSpecifierFirstLineHeadIndent")
    public static final long FirstLineHeadIndent = 1L;
    @GlobalConstant("kCTParagraphStyleSpecifierHeadIndent")
    public static final long HeadIndent = 2L;
    @GlobalConstant("kCTParagraphStyleSpecifierTailIndent")
    public static final long TailIndent = 3L;
    @GlobalConstant("kCTParagraphStyleSpecifierTabStops")
    public static final long TabStops = 4L;
    @GlobalConstant("kCTParagraphStyleSpecifierDefaultTabInterval")
    public static final long DefaultTabInterval = 5L;
    @GlobalConstant("kCTParagraphStyleSpecifierLineBreakMode")
    public static final long LineBreakMode = 6L;
    @GlobalConstant("kCTParagraphStyleSpecifierLineHeightMultiple")
    public static final long LineHeightMultiple = 7L;
    @GlobalConstant("kCTParagraphStyleSpecifierMaximumLineHeight")
    public static final long MaximumLineHeight = 8L;
    @GlobalConstant("kCTParagraphStyleSpecifierMinimumLineHeight")
    public static final long MinimumLineHeight = 9L;
    @GlobalConstant("kCTParagraphStyleSpecifierLineSpacing")
    public static final long LineSpacing = 10L;
    @GlobalConstant("kCTParagraphStyleSpecifierParagraphSpacing")
    public static final long ParagraphSpacing = 11L;
    @GlobalConstant("kCTParagraphStyleSpecifierParagraphSpacingBefore")
    public static final long ParagraphSpacingBefore = 12L;
    @GlobalConstant("kCTParagraphStyleSpecifierBaseWritingDirection")
    public static final long BaseWritingDirection = 13L;
    @GlobalConstant("kCTParagraphStyleSpecifierMaximumLineSpacing")
    public static final long MaximumLineSpacing = 14L;
    @GlobalConstant("kCTParagraphStyleSpecifierMinimumLineSpacing")
    public static final long MinimumLineSpacing = 15L;
    @GlobalConstant("kCTParagraphStyleSpecifierLineSpacingAdjustment")
    public static final long LineSpacingAdjustment = 16L;
    @GlobalConstant("kCTParagraphStyleSpecifierLineBoundsOptions")
    public static final long LineBoundsOptions = 17L;
    @GlobalConstant("kCTParagraphStyleSpecifierCount")
    public static final long Count = 18L;


}
