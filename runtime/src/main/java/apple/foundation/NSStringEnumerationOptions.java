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
@Mapping("NSStringEnumerationOptions")
public final class NSStringEnumerationOptions extends ObjCEnum {
    
    @GlobalConstant("NSStringEnumerationByLines")
    public static final long ByLines = 0L;
    @GlobalConstant("NSStringEnumerationByParagraphs")
    public static final long ByParagraphs = 1L;
    @GlobalConstant("NSStringEnumerationByComposedCharacterSequences")
    public static final long ByComposedCharacterSequences = 2L;
    @GlobalConstant("NSStringEnumerationByWords")
    public static final long ByWords = 3L;
    @GlobalConstant("NSStringEnumerationBySentences")
    public static final long BySentences = 4L;
    @GlobalConstant("NSStringEnumerationReverse")
    public static final long Reverse = 256L;
    @GlobalConstant("NSStringEnumerationSubstringNotRequired")
    public static final long SubstringNotRequired = 512L;
    @GlobalConstant("NSStringEnumerationLocalized")
    public static final long Localized = 1024L;
    

}
