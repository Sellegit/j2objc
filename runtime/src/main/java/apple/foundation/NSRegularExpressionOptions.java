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





@Library("Foundation/Foundation.h")
@Mapping("NSRegularExpressionOptions")
public final class NSRegularExpressionOptions extends ObjCEnum {
    
    @GlobalConstant("NSRegularExpressionCaseInsensitive")
    public static final long CaseInsensitive = 1L;
    @GlobalConstant("NSRegularExpressionAllowCommentsAndWhitespace")
    public static final long AllowCommentsAndWhitespace = 2L;
    @GlobalConstant("NSRegularExpressionIgnoreMetacharacters")
    public static final long IgnoreMetacharacters = 4L;
    @GlobalConstant("NSRegularExpressionDotMatchesLineSeparators")
    public static final long DotMatchesLineSeparators = 8L;
    @GlobalConstant("NSRegularExpressionAnchorsMatchLines")
    public static final long AnchorsMatchLines = 16L;
    @GlobalConstant("NSRegularExpressionUseUnixLineSeparators")
    public static final long UseUnixLineSeparators = 32L;
    @GlobalConstant("NSRegularExpressionUseUnicodeWordBoundaries")
    public static final long UseUnicodeWordBoundaries = 64L;
    

}
