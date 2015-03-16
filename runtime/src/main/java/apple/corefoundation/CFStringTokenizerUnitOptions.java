package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFStringTokenizerUnitOptions")
public final class CFStringTokenizerUnitOptions extends ObjCEnum {
    
    @GlobalConstant("kCFStringTokenizerUnitWord")
    public static final long UnitWord = 0L;
    @GlobalConstant("kCFStringTokenizerUnitSentence")
    public static final long UnitSentence = 1L;
    @GlobalConstant("kCFStringTokenizerUnitParagraph")
    public static final long UnitParagraph = 2L;
    @GlobalConstant("kCFStringTokenizerUnitLineBreak")
    public static final long UnitLineBreak = 3L;
    @GlobalConstant("kCFStringTokenizerUnitWordBoundary")
    public static final long UnitWordBoundary = 4L;
    @GlobalConstant("kCFStringTokenizerAttributeLatinTranscription")
    public static final long AttributeLatinTranscription = 65536L;
    @GlobalConstant("kCFStringTokenizerAttributeLanguage")
    public static final long AttributeLanguage = 131072L;
    

}
