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
@Mapping("CFStringTokenizerTokenType")
public final class CFStringTokenizerTokenType extends ObjCEnum {
    
    @GlobalConstant("kCFStringTokenizerTokenNone")
    public static final long None = 0L;
    @GlobalConstant("kCFStringTokenizerTokenNormal")
    public static final long Normal = 1L;
    @GlobalConstant("kCFStringTokenizerTokenHasSubTokensMask")
    public static final long HasSubTokensMask = 2L;
    @GlobalConstant("kCFStringTokenizerTokenHasDerivedSubTokensMask")
    public static final long HasDerivedSubTokensMask = 4L;
    @GlobalConstant("kCFStringTokenizerTokenHasHasNumbersMask")
    public static final long HasHasNumbersMask = 8L;
    @GlobalConstant("kCFStringTokenizerTokenHasNonLettersMask")
    public static final long HasNonLettersMask = 16L;
    @GlobalConstant("kCFStringTokenizerTokenIsCJWordMask")
    public static final long IsCJWordMask = 32L;
    

}
